package luj.data.api;

import luj.data.api.type.DataType;

public interface Data {

  Comparable<?> getId();

  DataType getType();

  void setType(DataType type);

  void setField(String name, Object value);

  Object getField(String name);

//  Map<String, ?> toMap();
}
