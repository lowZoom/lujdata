package luj.data.internal.data.create;

import luj.data.api.Data;
import luj.data.api.type.DataType;

import java.util.Map;

final class DataImpl implements Data {

  @Override
  public Comparable<?> getId() {
    return _id;
  }

  @Override
  public DataType getType() {
    return _type;
  }

  @Override
  public void setType(DataType type) {
    _type = type;
  }

  @Override
  public void setField(String name, Object value) {
    _fieldMap.put(name, value);
  }

  @Override
  public Object getField(String name) {
    return _fieldMap.get(name);
  }

  //  @Override
//  public Map<String, ?> toMap() {
//    return _fieldMap.getValue();
//  }

  Comparable<?> _id;
  DataType _type;

  Map<String, Object> _fieldMap;
}
