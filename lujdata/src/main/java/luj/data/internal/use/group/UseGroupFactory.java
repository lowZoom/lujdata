package luj.data.internal.use.group;

import luj.data.api.use.UseGroup;

public enum UseGroupFactory {
  GET;

  public UseGroup create() {
    UseGroupImpl group = new UseGroupImpl();



    return group;
  }
}
