package luj.data.internal.use.field;

import luj.data.api.Data;
import luj.data.api.field.type.JStr;
import luj.data.internal.data.types.primitive.PrimitiveInternal;
import luj.data.internal.data.types.primitive.internal.PrimitiveInImpl;

import static com.google.common.base.Preconditions.checkNotNull;

final class JStrImpl implements JStr, HasInternal<PrimitiveInternal> {

  static JStrImpl create(Data data, String fieldName) {
    Object oldVal = data.getField(fieldName);
    String newVal = oldVal == null ? "" : (String) oldVal;

    JStrImpl result = new JStrImpl();
    result._val = newVal;
    result._internal = new PrimitiveInImpl(() -> result._val, data, fieldName);

    return result;
  }

  @Override
  public String get() {
    return _val;
  }

  @Override
  public void set(String val) {
    _val = checkNotNull(val);
  }

  @Override
  public String toString() {
    return _val;
  }

  @Override
  public PrimitiveInternal getInternal() {
    return _internal;
  }

  String _val;

  PrimitiveInternal _internal;
}
