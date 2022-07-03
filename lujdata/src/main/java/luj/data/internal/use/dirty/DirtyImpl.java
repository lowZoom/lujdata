package luj.data.internal.use.dirty;

import luj.data.api.type.DataType;
import luj.data.api.use.DirtyItem;
import luj.data.internal.data.types.map.MapInternal;
import luj.data.internal.use.UseState;

import java.util.Map;

public class DirtyImpl implements DirtyItem {

  public DirtyImpl(UseState state) {
    _state = state;
  }

  @Override
  public Comparable<?> getDataId() {
    return _state.getData().getId();
  }

  @Override
  public DataType getDataType() {
    return _state.getData().getType();
  }

  @Override
  public Map<String, Object> getPrimitiveFields() {
    return PrimitiveDirtyEncoder.GET.encode(_state);
  }

  @Override
  public Map<String, MapInternal.Dirty> getMapFields() {
    return MapDirtyEncoder.GET.encode(_state);
  }

  @Override
  public boolean isNew() {
    return _state.isNew();
  }

  @Override
  public void flush() {
    DirtyFlusher.GET.flush(_state);
  }

  private final UseState _state;
}
