package luj.data.internal.use.field;

import luj.data.internal.use.UseState;

import java.lang.reflect.Method;
import java.util.Map;

public enum UseFieldInitOrGetter {
  GET;

  public Object getOrInit(UseState state, String name) {
    Map<String, Object> fieldMap = state.getFieldMap();
    Object oldVal = fieldMap.get(name);
    if (oldVal != null) {
      return oldVal;
    }

    Method method = getMethod(state, name);
    Object newVal = UseFieldMaker.GET.make(state.getData(), name, method.getReturnType());
    fieldMap.put(name, newVal);

    return newVal;
  }

  private Method getMethod(UseState state, String name) {
    try {
      return state.getDataClass().getDeclaredMethod(name);

    } catch (NoSuchMethodException e) {
      throw new UnsupportedOperationException(e);
    }
  }
}
