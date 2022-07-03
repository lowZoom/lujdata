package luj.data.internal.context;

import luj.data.api.Data;
import luj.data.api.DataContext;
import luj.data.api.type.DataType;
import luj.data.api.type.TypePool;
import luj.data.api.use.UseGroup;
import luj.data.internal.data.create.DataObjMaker;
import luj.data.internal.type.pool.TypePoolFactory;
import luj.data.internal.use.group.UseGroupFactory;

final class DataContextImpl implements DataContext {

  @Override
  public Data createData(Comparable<?> id) {
    return DataObjMaker.GET.make(id);
  }

  @Override
  public TypePool createTypePool() {
    return TypePoolFactory.GET.create();
  }

  @Override
  public UseGroup createUseGroup() {
    return UseGroupFactory.GET.create();
  }
}
