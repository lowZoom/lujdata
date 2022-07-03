package luj.data.internal.use.field;

import luj.data.api.Data;
import luj.data.api.field.type.JInt;
import luj.data.internal.data.types.primitive.PrimitiveInternal;
import luj.data.internal.data.types.primitive.internal.PrimitiveInImpl;

final class JIntImpl implements JInt, HasInternal<PrimitiveInternal> {

  static JIntImpl create(Data data, String fieldName) {
    Object oldVal = data.getField(fieldName);
    Integer newVal = oldVal == null ? 0 : (Integer) oldVal;

    JIntImpl result = new JIntImpl();
    result._val = newVal;
    result._internal = new PrimitiveInImpl(() -> result._val, data, fieldName);

    return result;
  }

  @Override
  public int get() {
    return _val;
  }

  @Override
  public void set(int val) {
    _val = val;
  }

  @Override
  public void add(int delta) {
    _val += delta;
  }

  @Override
  public String toString() {
    return Integer.toString(_val);
  }

  @Override
  public PrimitiveInternal getInternal() {
    return _internal;
  }

  int _val;

  PrimitiveInternal _internal;
}
