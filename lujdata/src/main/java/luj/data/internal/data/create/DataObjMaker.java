package luj.data.internal.data.create;

import luj.data.api.Data;
import luj.data.api.type.DataType;
import luj.data.internal.data.types.map.MapState;

import java.util.HashMap;

public enum DataObjMaker {
  GET;

  public Data make(Comparable<?> id) {
    DataImpl result = new DataImpl();

    result._id = id;
    result._fieldMap = new HashMap<>();

    return result;
  }
}
