package luj.data.api.type;

import luj.data.api.field.TypeField;

import java.util.Collection;

public interface DataType {

  String getName();

//  String getSimpleName();

  TypeField getField(String name);

  Collection<TypeField> getFields();
}
