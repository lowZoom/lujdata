package luj.data.api.use;

public interface DataUse {

  Object getField(String name);

  void markNew();

  DirtyItem toDirty();
}
