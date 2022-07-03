package luj.data.internal.use.group;

import luj.data.api.Data;
import luj.data.api.use.DataUse;
import luj.data.api.use.DirtyItem;
import luj.data.api.use.UseGroup;
import luj.data.internal.use.UseObjFactory;

import java.util.stream.Stream;

final class UseGroupImpl implements UseGroup {

  @Override
  public DataUse use(Data data, Class<?> type) {
    DataUse use = UseObjFactory.GET.create(data, type);
    _state.getUseList().add(use);
    return use;
  }

  @Override
  public Stream<DataUse> stream() {
    return _state.getUseList().stream();
  }

  GroupState _state = new GroupState();
}
