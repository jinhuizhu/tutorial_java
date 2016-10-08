package com.zjh.learning.jse.generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jinhui on 10/8/2016.
 */
public class LowerBoundedWildcard {
    public static void addNumber(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);  // java.lang.UnsupportedOperationException  TODO why?
        }
    }

    public static void main(String[] args) {
        List<? super Integer> li = Arrays.asList(1, 2, 3);
        addNumber(li);
        System.out.println(li);
    }
}
