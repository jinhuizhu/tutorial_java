package com.zjh.learning.algo;

import io.micrometer.core.instrument.util.StringUtils;
import org.apache.logging.log4j.util.Strings;

import java.util.Stack;

public class SymmetricString {
    /**
     * Test whether the given string is symmetric or not. Blank strings and single-char strings are symmetric.
     * @param s
     * @return
     */
    public static boolean isSymmetric(String s) {
        if (Strings.isBlank(s) || s.length() == 1) {
            return true;
        }
        int length = s.length();

        Stack<Character> firstHalf = new Stack<>();
        Stack<Character> secondHalf = new Stack<>();
        for (int i = 0; i < length / 2; i++) {
            firstHalf.push(s.charAt(i));
            secondHalf.push(s.charAt(length - 1 - i));
        }

        return firstHalf.equals(secondHalf);
    }
}
