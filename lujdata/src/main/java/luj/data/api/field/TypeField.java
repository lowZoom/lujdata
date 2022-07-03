package luj.data.api.field;

import luj.data.api.Data;

public interface TypeField {

  String getName();

  TypeInField getType();

  <T> T getValue(Data data);
}
