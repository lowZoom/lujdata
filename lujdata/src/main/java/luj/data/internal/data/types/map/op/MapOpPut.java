package luj.data.internal.data.types.map.op;

import luj.data.internal.data.types.map.MapState;

import java.util.Set;

public enum MapOpPut {
  GET;

  public <K, V> V put(MapState<K, V> state, K key, V val) {
    Set<K> dirtyKey = DirtyKeyGetOrInit.GET.getOrInit(state);
    dirtyKey.add(key);
    return state.getDirty().put(key, val);
  }
}
