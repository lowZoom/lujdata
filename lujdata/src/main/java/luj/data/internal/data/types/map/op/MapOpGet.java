package luj.data.internal.data.types.map.op;

import luj.data.internal.data.types.map.MapState;

public enum MapOpGet {
  GET;

  public <K, V> V get(MapState<K, V> state, K key) {
    V dirtyVal = state.getDirty().get(key);
    if (dirtyVal != null) {
      return dirtyVal;
    }

    //TODO: 考虑删除历史

    return state.getOld().get(key);
  }
}
