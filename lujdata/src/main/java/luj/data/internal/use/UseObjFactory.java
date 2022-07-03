package luj.data.internal.use;

import luj.data.api.Data;
import luj.data.api.use.DataUse;

public enum UseObjFactory {
  GET;

  public DataUse create(Data data, Class<?> type) {
    UseState state = new UseState();
    state._data = data;
    state._dataClass = type;

    UseImpl use = new UseImpl();
    use._state = state;

    return use;
  }
}
