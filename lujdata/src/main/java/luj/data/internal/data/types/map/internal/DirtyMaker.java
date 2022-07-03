package luj.data.internal.data.types.map.internal;

import luj.data.internal.data.types.map.MapInternal;
import luj.data.internal.data.types.map.MapState;

import java.util.Map;
import java.util.Set;

enum DirtyMaker {
  GET;

  @SuppressWarnings("unchecked")
  MapInternal.Dirty make(MapState<?, ?> state) {
    Map<Object, Object> updated = (Map<Object, Object>) state.getDirty();

    return new MapInternal.Dirty() {
      @Override
      public Map<Object, Object> updated() {
        return updated;
      }

      @Override
      public Set<Object> removed() {
        return null;
      }
    };
  }
}
