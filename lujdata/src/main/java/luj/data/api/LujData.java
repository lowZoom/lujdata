package luj.data.api;

import luj.data.internal.context.DataContextFactory;

public enum LujData {
  ;

  public static DataContext start() {
    return DataContextFactory.GET.create();
  }
}
