/*
 * Copyright (c) 2018 JCPenney Co. All rights reserved.
 */
package map;

import java.util.stream.Stream;

/**
 * Class for MyHashMap.
 */
public class MyHashMap<K, V> {

  private static final int CAPACITY = 16;

  private Entry<K, V>[] bucket = new Entry[CAPACITY];

  public void put(K key, V value) {
    int hashcode = 0;

    int index = Math.abs(hash(key) % CAPACITY);
    if (bucket[index] == null) {
      bucket[index] = new Entry<>(key, value, null);
    } else {
      Entry<K, V> temp = bucket[index];
      bucket[index] = new Entry<>(key, value, temp);
    }
  }

  public V get(K key) {
    int index = Math.abs(hash(key) % CAPACITY);
    if (bucket[index] == null) {
      throw new RuntimeException("Key does not exist");
    }
    Entry<K, V> temp = bucket[index];
    while (temp != null) {
      if (temp.key == null || temp.key.equals(key)) {
        return temp.value;
      }
      temp = temp.next;
    }
    return null;
  }

  private int hash(K key) {
    return key == null ? 0 : key.hashCode();
  }


  private static class Entry<K, V> {

    private K key;
    private V value;
    private Entry next;

    public Entry(K key, V value, Entry next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }

  public void print() {
    Stream.of(bucket).forEach(System.out::println);
  }


}
