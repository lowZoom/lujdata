package luj.data.internal.data.types.map.op;

import luj.data.internal.data.types.map.MapState;

import java.util.HashSet;
import java.util.Set;

@Deprecated
enum DirtyKeyGetOrInit {
  GET;

  <K> Set<K> getOrInit(MapState<K, ?> state) {
//    Set<K> oldKey = state.getDirtyKey();
//    if (oldKey != null) {
//      return oldKey;
//    }

    Set<K> newKey = new HashSet<>();
//    state.setDirtyKey(newKey);
    return newKey;
  }
}
