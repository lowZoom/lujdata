package luj.data.api.use;

import luj.data.api.type.DataType;
import luj.data.internal.data.types.map.MapInternal;

import java.util.List;
import java.util.Map;

public interface DirtyItem {

  Comparable<?> getDataId();

  DataType getDataType();

//  Set<String> getDirtyFields();

  Map<String, Object> getPrimitiveFields();

  Map<String, MapInternal.Dirty> getMapFields();

  boolean isNew();

  void flush();
}
