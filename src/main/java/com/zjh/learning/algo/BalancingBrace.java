/**
 * Copyright (c) Jinhui Zhu (jinhuizhu@gmail.com)
 * All rights reserved.
 */
package com.zjh.learning.algo;


import org.apache.logging.log4j.util.Strings;

import java.util.Stack;

/**
 * @author Jinhui Zhu (jinhuizhu@gmail.com)
 * created at:  2021/5/25 21:50
 */
public class BalancingBrace {
    /**
     * Test whether the braces ("(", ")") are balanced in the given string:
     *   - for each "(", there should be a closing ")"
     *   - the first brace in the string can only be a "("
     *
     * @param s
     * @return
     */
    public static boolean hasBalancingBraces(String s) {
        if (Strings.isBlank(s)) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('B');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
