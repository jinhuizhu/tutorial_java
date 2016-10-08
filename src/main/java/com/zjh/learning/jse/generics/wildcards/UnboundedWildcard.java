package com.zjh.learning.jse.generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jinhui on 10/8/2016.
 */
public class UnboundedWildcard {
    public static void printList(List<?> list) {
        for (Object elem: list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        printList(li);

        List<String> ls = Arrays.asList("one", "two", "three");
        printList(ls);
    }
}
