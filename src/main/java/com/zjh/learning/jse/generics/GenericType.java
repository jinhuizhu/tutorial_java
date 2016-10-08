package com.zjh.learning.jse.generics;

/**
 * T:  type parameter
 *
 * Created by jinhui on 10/6/2016.
 */
public class GenericType<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
