package luj.data.internal.use;

import luj.data.api.Data;

import java.util.HashMap;
import java.util.Map;

public class UseState {

  public boolean isNew() {
    return _new;
  }

  public Data getData() {
    return _data;
  }

  public Class<?> getDataClass() {
    return _dataClass;
  }

  public Map<String, Object> getFieldMap() {
    return _fieldMap;
  }

  boolean _new;

  Data _data;
  Class<?> _dataClass;

  private final Map<String, Object> _fieldMap = new HashMap<>();
}
