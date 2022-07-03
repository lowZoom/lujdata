package luj.data.internal.data.types.map.op;

import luj.data.api.Data;
import luj.data.internal.data.types.map.MapState;

import java.util.HashMap;
import java.util.Map;

public enum OpCreateState {
  GET;

  public <K, V> MapState<K, V> create(Data data, String fieldName) {
    Map<K, V> old = getOrInitField(data, fieldName);
    return new MapState<>(old);
  }

  @SuppressWarnings("unchecked")
  private <K, V> Map<K, V> getOrInitField(Data data, String fieldName) {
    Object oldVal = data.getField(fieldName);
    if (oldVal != null) {
      return (Map<K, V>) oldVal;
    }

    Map<K, V> newVal = new HashMap<>();
    data.setField(fieldName, newVal);
    return newVal;
  }
}
