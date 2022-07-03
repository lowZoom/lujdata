package luj.data.internal.type.field;

import luj.data.api.field.TypeInField;

final class TypeMap implements TypeInField.Map {

  @Override
  public TypeInField getKeyType() {
    return _keyType;
  }

  @Override
  public TypeInField getValueType() {
    return _valueType;
  }

  TypeImpl _keyType;

  TypeImpl _valueType;
}
