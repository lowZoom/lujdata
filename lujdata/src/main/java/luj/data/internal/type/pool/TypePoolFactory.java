package luj.data.internal.type.pool;

import luj.data.api.type.TypePool;

import java.util.concurrent.ConcurrentHashMap;

public enum TypePoolFactory {
  GET;

  public TypePool create() {
    PoolImpl pool = new PoolImpl();
    pool._typeCache = new ConcurrentHashMap<>();
    return pool;
  }
}
