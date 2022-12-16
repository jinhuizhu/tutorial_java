package com.zjh.learning.jse.generics;

/**
 * special multiple bounds: class D <T extends A & B & C> { ... }
 * Created by jinhui on 10/7/2016.
 */
public class BoundedTypeParameter<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        BoundedTypeParameter<Integer> integerBox = new BoundedTypeParameter<>();
        integerBox.set(10);
//        integerBox.inspect("some text"); // error: this is still String!
    }
}
