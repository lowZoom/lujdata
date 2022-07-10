package luj.data.internal.type.field;

import com.google.common.collect.ImmutableSet;
import luj.ava.reflect.type.TypeX;

import java.lang.reflect.Type;
import java.util.Set;

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
    type._primitiveSet = PRIMITIVE;
    return type;
  }

  static final Set<Class<?>> PRIMITIVE = ImmutableSet.of(
      Integer.class,
      Long.class,
      String.class
  );
}
