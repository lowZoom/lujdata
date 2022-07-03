package luj.data.internal.context;

import luj.data.api.DataContext;

public enum DataContextFactory {
  GET;

  public DataContext create() {
    return new DataContextImpl();
  }
}
