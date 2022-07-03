package luj.data.internal.use.field;

import luj.data.api.Data;
import luj.data.api.field.type.JInt;
import luj.data.api.field.type.JList;
import luj.data.api.field.type.JLong;
import luj.data.api.field.type.JMap;
import luj.data.api.field.type.JStr;

public enum UseFieldMaker {
  GET;

  public Object make(Data data, String name, Class<?> type) {
    if (type == JInt.class) {
      return JIntImpl.create(data, name);
    }
    if (type == JLong.class) {
      return JLongImpl.create(data, name);
    }
    if (type == JStr.class) {
      return JStrImpl.create(data, name);
    }
    if (type == JMap.class) {
      return JMapImpl.create(data, name);
    }
    if (type == JList.class) {
      return new JListImpl<>();
    }

    throw new IllegalArgumentException("不支持的类型：" + type.getName());
  }
}
