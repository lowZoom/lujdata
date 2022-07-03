package luj.data.internal.data.types.map.internal;

import luj.data.internal.data.types.map.MapInternal;
import luj.data.internal.data.types.map.MapState;

public class MapInternalImpl implements MapInternal {

  public MapInternalImpl(MapState<?, ?> state) {
    _state = state;
  }

  @Override
  public Dirty getDirty() {
    return DirtyMaker.GET.make(_state);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void flushDirty() {
    DirtyFlusher.GET.flush((MapState<Object, Object>) _state);
  }

  private final MapState<?, ?> _state;
}
