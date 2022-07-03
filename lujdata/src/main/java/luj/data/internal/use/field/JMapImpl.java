package luj.data.internal.use.field;

import com.google.common.collect.ImmutableList;
import luj.data.api.Data;
import luj.data.api.field.type.JMap;
import luj.data.internal.data.types.map.MapInternal;
import luj.data.internal.data.types.map.MapState;
import luj.data.internal.data.types.map.internal.MapInternalImpl;
import luj.data.internal.data.types.map.op.MapOpGet;
import luj.data.internal.data.types.map.op.MapOpPut;
import luj.data.internal.data.types.map.op.OpCreateState;

import java.util.Collection;

final class JMapImpl<K, V> implements JMap<K, V>, HasInternal<MapInternal> {

  static <K, V> JMapImpl<K, V> create(Data data, String fieldName) {
    MapState<K, V> state = OpCreateState.GET.create(data, fieldName);
    MapInternal internal = new MapInternalImpl(state);

    JMapImpl<K, V> map = new JMapImpl<>();
    map._state = state;
    map._internal = internal;

    return map;
  }

  @Override
  public V get(K key) {
    return MapOpGet.GET.get(_state, key);
  }

  @Override
  public V put(K key, V value) {
    return MapOpPut.GET.put(_state, key, value);
  }

  @Override
  public Collection<V> values() {
    return ImmutableList.<V>builder()
        .addAll(_state.getOld().values())
        .addAll(_state.getDirty().values())
        .build();
  }

  @Override
  public MapInternal getInternal() {
    return _internal;
  }

  MapState<K, V> _state;

  MapInternal _internal;
}
