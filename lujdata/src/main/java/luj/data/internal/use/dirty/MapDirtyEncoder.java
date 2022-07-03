package luj.data.internal.use.dirty;

import luj.data.api.type.DataType;
import luj.data.internal.use.field.HasInternal;
import luj.data.internal.data.types.map.MapInternal;
import luj.data.internal.use.UseState;

import java.util.Map;

import static java.util.stream.Collectors.toMap;

public enum MapDirtyEncoder {
  GET;

  public Map<String, MapInternal.Dirty> encode(UseState state) {
    DataType type = state.getData().getType();

    return state.getFieldMap().entrySet().stream()
        .filter(e -> isMapType(type, e.getKey()))
        .collect(toMap(Map.Entry::getKey, e -> encodeField(e.getValue())));
  }

  private boolean isMapType(DataType type, String field) {
    return type.getField(field).getType().isMap();
  }

  @SuppressWarnings("unchecked")
  private MapInternal.Dirty encodeField(Object value) {
    MapInternal internal = ((HasInternal<MapInternal>) value).getInternal();
    return internal.getDirty();
  }
}
