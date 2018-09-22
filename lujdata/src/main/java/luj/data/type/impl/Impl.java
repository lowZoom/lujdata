package luj.data.type.impl;

import java.util.function.Function;

public enum Impl {
  ;

  public static Function<Data, Object> getter() {
    return data -> data._impl;
  }

  public static void set(Data data, Object impl) {
    data._impl = impl;
  }
}
