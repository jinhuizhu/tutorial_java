package com.zjh.learning.algo;

import io.micrometer.core.instrument.util.StringUtils;

import java.util.Stack;

public class StringHelper {
    /**
     * Test whether the given string is symmetric or not.
     * @param s
     * @return
     */
    public static boolean isSymmetric(String s) {
        if (StringUtils.isBlank(s)) {
            return true;
        }
        int length = s.length();
        if (length == 1) {
            return true;
        }

        Stack<Character> firstHalf = new Stack<>();
        Stack<Character> secondHalf = new Stack<>();
        for (int i = 0; i < length / 2; i++) {
            firstHalf.push(s.charAt(i));
            secondHalf.push(s.charAt(length - 1 - i));
        }

        return firstHalf.equals(secondHalf);
    }
}
