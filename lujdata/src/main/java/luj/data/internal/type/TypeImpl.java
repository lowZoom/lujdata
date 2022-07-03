package luj.data.internal.type;

import luj.data.api.field.TypeField;
import luj.data.api.type.DataType;

import java.util.Collection;
import java.util.List;
import java.util.Map;

final class TypeImpl implements DataType {

  @Override
  public String getName() {
    return _name;
  }

  @Override
  public TypeField getField(String name) {
    return _fieldMap.get(name);
  }

  @Override
  public Collection<TypeField> getFields() {
    return _fieldMap.values();
  }

  String _name;

  Map<String, TypeField> _fieldMap;
}
