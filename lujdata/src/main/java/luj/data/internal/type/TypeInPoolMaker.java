package luj.data.internal.type;

import luj.data.api.field.TypeField;
import luj.data.api.type.DataType;
import luj.data.internal.type.field.FieldFactory;

import java.util.Arrays;
import java.util.function.Function;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.collect.ImmutableMap.toImmutableMap;

public enum TypeInPoolMaker {
  GET;

  public DataType make(Class<?> clazz) {
    String typeName = clazz.getName();
    checkArgument(clazz.isInterface(), typeName);

    TypeImpl type = new TypeImpl();
    type._name = typeName;

    type._fieldMap = Arrays.stream(clazz.getMethods())
        .map(FieldFactory.GET::create)
        .collect(toImmutableMap(TypeField::getName, Function.identity()));

    return type;
  }
}
