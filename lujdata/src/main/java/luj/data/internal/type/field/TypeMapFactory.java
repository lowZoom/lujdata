package luj.data.internal.type.field;

import luj.ava.reflect.type.TypeX;

import java.lang.reflect.Type;

enum TypeMapFactory {
  GET;

  TypeMap create(Type generic) {
    TypeX<?> map = TypeX.of(generic);

    TypeMap result = new TypeMap();
    result._keyType = makeType(map.getTypeParam(0));
    result._valueType = makeType(map.getTypeParam(1));

    return result;
  }

  private TypeImpl makeType(TypeX<?> tx) {
    TypeImpl type = new TypeImpl();
    type._clazz = tx.asClass();
    return type;
  }
}
