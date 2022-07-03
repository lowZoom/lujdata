package luj.data.internal.data.types.primitive.internal;

import luj.data.api.Data;
import luj.data.internal.data.types.primitive.PrimitiveInternal;

import java.util.function.Supplier;

public class PrimitiveInImpl implements PrimitiveInternal {

  public PrimitiveInImpl(Supplier<Object> value, Data data, String fieldName) {
    _value = value;
    _data = data;
    _fieldName = fieldName;
  }

  @Override
  public Object getDirty() {
    return _value.get();
  }

  @Override
  public void flushDirty() {
    _data.setField(_fieldName, getDirty());
  }

  private final Supplier<Object> _value;

  private final Data _data;
  private final String _fieldName;
}
