package luj.data.api.field;

public interface TypeInField {

  interface Map {

    TypeInField getKeyType();

    TypeInField getValueType();
  }

  boolean isPrimitive();

  boolean isMap();

  Map asMapType();

  Class<?> asJavaClass();
}
