package luj.data.internal.type.field;

import com.google.common.collect.ImmutableSet;
import luj.data.api.field.TypeField;
import luj.data.api.field.type.JInt;
import luj.data.api.field.type.JLong;
import luj.data.api.field.type.JStr;

import java.lang.reflect.Method;
import java.util.Set;

public enum FieldFactory {
  GET;

  public TypeField create(Method method) {
    TypeImpl type = new TypeImpl();
    type._clazz = method.getReturnType();
    type._generic = method.getGenericReturnType();
    type._primitiveSet = PRIMITIVE;

    FieldImpl field = new FieldImpl();
    field._name = method.getName();
    field._type = type;

    return field;
  }

  private static final Set<Class<?>> PRIMITIVE = ImmutableSet.of(
      JInt.class,
      JLong.class,
      JStr.class
  );
}
