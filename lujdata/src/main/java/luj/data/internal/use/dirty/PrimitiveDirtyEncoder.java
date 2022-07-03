package luj.data.internal.use.dirty;

import luj.data.api.type.DataType;
import luj.data.internal.data.types.primitive.PrimitiveInternal;
import luj.data.internal.use.UseState;
import luj.data.internal.use.field.HasInternal;

import java.util.Map;

import static java.util.stream.Collectors.toMap;

public enum PrimitiveDirtyEncoder {
  GET;

  public Map<String, Object> encode(UseState state) {
    DataType type = state.getData().getType();

    return state.getFieldMap().entrySet().stream()
        .filter(e -> isPrimitiveType(type, e.getKey()))
        .collect(toMap(Map.Entry::getKey, e -> encodeField(e.getValue())));
  }

  private boolean isPrimitiveType(DataType type, String field) {
    return type.getField(field).getType().isPrimitive();
  }

  @SuppressWarnings("unchecked")
  private Object encodeField(Object value) {
    PrimitiveInternal internal = ((HasInternal<PrimitiveInternal>) value).getInternal();
    return internal.getDirty();
  }
}
