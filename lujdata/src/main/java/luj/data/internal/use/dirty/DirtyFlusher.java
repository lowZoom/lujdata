package luj.data.internal.use.dirty;

import luj.data.internal.use.field.HasInternal;
import luj.data.internal.use.UseState;

enum DirtyFlusher {
  GET;

  @SuppressWarnings("unchecked")
  public void flush(UseState state) {
    state.getFieldMap().values().stream()
        .map(v -> (HasInternal<CanDirty>) v)
        .map(HasInternal::getInternal)
        .forEach(CanDirty::flushDirty);
  }
}
