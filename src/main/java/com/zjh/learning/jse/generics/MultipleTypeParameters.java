package com.zjh.learning.jse.generics;

/**
 * Created by jinhui on 10/7/2016.
 */

interface IPair<K, V> {
    public K getKey();
    public V getValue();
}

public class MultipleTypeParameters<K, V> implements IPair<K, V> {
    private K key;
    private V value;

    public MultipleTypeParameters(K key, V value) {
        this.key = key;
        this.value = value;
    }


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
