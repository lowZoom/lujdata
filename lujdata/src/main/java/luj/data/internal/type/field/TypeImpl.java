package luj.data.internal.type.field;

import luj.data.api.field.TypeInField;
import luj.data.api.field.type.JMap;

import java.lang.reflect.Type;
import java.util.Set;

final class TypeImpl implements TypeInField {

  @Override
  public boolean isPrimitive() {
    return _primitiveSet.contains(_clazz);
  }

  @Override
  public boolean isMap() {
    return _clazz == JMap.class;
  }

  @Override
  public Map asMapType() {
    return TypeMapFactory.GET.create(_generic);
  }

  @Override
  public Class<?> asJavaClass() {
    return _clazz;
  }

  @Override
  public String toString() {
    return "FieldType{" + _clazz.getName() + '}';
  }

  Class<?> _clazz;
  Type _generic;

  Set<Class<?>> _primitiveSet;
}
