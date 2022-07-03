package luj.data.internal.use.group;

import luj.data.api.use.DataUse;

import java.util.ArrayList;
import java.util.List;

public class GroupState {

  public List<DataUse> getUseList() {
    return _useList;
  }

  private final List<DataUse> _useList = new ArrayList<>();
}
