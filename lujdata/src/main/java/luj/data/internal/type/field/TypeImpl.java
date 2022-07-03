package luj.data.internal.type.field;

import luj.data.api.field.TypeInField;
import luj.data.api.field.type.JInt;
import luj.data.api.field.type.JLong;
import luj.data.api.field.type.JMap;
import luj.data.api.field.type.JStr;

import java.lang.reflect.Type;

final class TypeImpl implements TypeInField {

  @Override
  public boolean isPrimitive() {
    return _clazz == JInt.class
        || _clazz == JLong.class
        || _clazz == JStr.class;
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
}
