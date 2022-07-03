package luj.data.internal.data.types.map;

import luj.data.internal.use.dirty.CanDirty;

import java.util.Map;
import java.util.Set;

public interface MapInternal extends CanDirty {

  interface Dirty {

    Map<Object, Object> updated();

    Set<Object> removed();
  }

  Dirty getDirty();
}
