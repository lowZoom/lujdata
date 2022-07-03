package luj.data.internal.type.field;

import luj.data.api.field.TypeField;

import java.lang.reflect.Method;

public enum FieldFactory {
  GET;

  public TypeField create(Method method) {
    TypeImpl type = new TypeImpl();
    type._clazz = method.getReturnType();
    type._generic = method.getGenericReturnType();

    FieldImpl field = new FieldImpl();
    field._name = method.getName();
    field._type = type;

    return field;
  }
}
