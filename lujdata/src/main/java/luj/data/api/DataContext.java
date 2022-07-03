package luj.data.api;

import luj.data.api.type.TypePool;
import luj.data.api.use.UseGroup;

public interface DataContext {

  Data createData(Comparable<?> id);

  TypePool createTypePool();

  UseGroup createUseGroup();
}
