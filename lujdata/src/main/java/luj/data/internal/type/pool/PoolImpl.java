package luj.data.internal.type.pool;

import luj.data.api.type.DataType;
import luj.data.api.type.TypePool;
import luj.data.internal.type.TypeInPoolMaker;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

final class PoolImpl implements TypePool {

  @Override
  public DataType getType(Class<?> clazz) {
    return _typeCache.computeIfAbsent(clazz, TypeInPoolMaker.GET::make);
  }

  ConcurrentMap<Class<?>, DataType> _typeCache;
}
