package luj.data.api.field.type;

import java.util.Collection;

public interface JMap<K, V> {
  // Query Operations
  V get(K key);

  // Modification Operations
  V put(K key, V value);

  // Views
  Collection<V> values();
}
