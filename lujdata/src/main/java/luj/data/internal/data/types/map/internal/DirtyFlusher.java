package luj.data.internal.data.types.map.internal;

import luj.data.internal.data.types.map.MapState;

import java.util.Map;

enum DirtyFlusher {
  GET;

  void flush(MapState<Object, Object> state) {
    Map<Object, Object> dirty = state.getDirty();
    state.getOld().putAll(dirty);
  }
}
