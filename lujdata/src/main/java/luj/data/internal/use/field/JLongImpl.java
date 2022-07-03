package luj.data.internal.use.field;

import luj.data.api.Data;
import luj.data.api.field.type.JLong;
import luj.data.internal.data.types.primitive.PrimitiveInternal;
import luj.data.internal.data.types.primitive.internal.PrimitiveInImpl;

final class JLongImpl implements JLong, HasInternal<PrimitiveInternal> {

  static JLongImpl create(Data data, String fieldName) {
    Object oldVal = data.getField(fieldName);
    Long newVal = oldVal == null ? 0 : ((Number) oldVal).longValue();

    JLongImpl result = new JLongImpl();
    result._val = newVal;
    result._internal = new PrimitiveInImpl(() -> result._val, data, fieldName);

    return result;
  }

  @Override
  public long get() {
    return _val;
  }

  @Override
  public void set(long val) {
    _val = val;
  }

  @Override
  public String toString() {
    return Long.toString(_val);
  }

  @Override
  public PrimitiveInternal getInternal() {
    return _internal;
  }

  long _val;

  PrimitiveInternal _internal;
}
