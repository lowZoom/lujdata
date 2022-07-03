package luj.data.internal.type.field;

import luj.data.api.Data;
import luj.data.api.field.TypeField;
import luj.data.api.field.TypeInField;

final class FieldImpl implements TypeField {

  @Override
  public String getName() {
    return _name;
  }

  @Override
  public TypeInField getType() {
    return _type;
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T getValue(Data data) {
    return (T) data.getField(_name);
  }

  String _name;

  TypeImpl _type;
}
