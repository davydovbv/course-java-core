package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<V,K> swap(Pair<K,V> pair) {
        return new Pair(pair.getValue(), pair.getKey());
    }

    public Pair<V,K> getSwapped(){
        return new Pair(this.value, this.key);


    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
