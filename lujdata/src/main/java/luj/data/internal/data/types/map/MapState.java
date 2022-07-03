package luj.data.internal.data.types.map;

import java.util.HashMap;
import java.util.Map;

public class MapState<K, V> {

  public MapState(Map<K, V> old) {
    _old = old;
  }

  public Map<K, V> getDirty() {
    return _dirty;
  }

  public Map<K, V> getOld() {
    return _old;
  }

  private final Map<K, V> _dirty = new HashMap<>();

  private final Map<K, V> _old;
}
