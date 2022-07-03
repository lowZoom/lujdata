package luj.data.internal.use;

import luj.data.api.use.DataUse;
import luj.data.api.use.DirtyItem;
import luj.data.internal.use.dirty.DirtyImpl;
import luj.data.internal.use.field.UseFieldInitOrGetter;

final class UseImpl implements DataUse {

  @Override
  public Object getField(String name) {
    return UseFieldInitOrGetter.GET.getOrInit(_state, name);
  }

  @Override
  public void markNew() {
    _state._new = true;
  }

  @Override
  public DirtyItem toDirty() {
    return new DirtyImpl(_state);
  }

  @Override
  public String toString() {
    return "UseImpl{" +
        "_state=" + _state +
        '}';
  }

  UseState _state;
}
