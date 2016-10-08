package com.zjh.learning.jse.generics.wildcards;

import java.util.List;

/**
 * Created by jinhui on 10/8/2016.
 */
public class WildcardCapture {
    // compile error:
//    void foo1(List<?> i) {
//        i.set(0, i.get(0));
//    }

    public void foo(List<?> list) {
        fooHelper(list);
    }

    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}
