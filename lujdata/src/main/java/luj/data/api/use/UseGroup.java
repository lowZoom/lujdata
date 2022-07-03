package luj.data.api.use;

import luj.data.api.Data;

import java.util.stream.Stream;

public interface UseGroup {

  DataUse use(Data data, Class<?> type);

  Stream<DataUse> stream();
}
