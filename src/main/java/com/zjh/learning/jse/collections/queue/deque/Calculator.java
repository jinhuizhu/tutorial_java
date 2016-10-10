package com.zjh.learning.jse.collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

import static java.lang.Integer.parseInt;

/**
 * Created by jinhui on 10/10/2016.
 */
public class Calculator {
    private Queue<String> stack = new ArrayDeque<>();

    public int evaluate(String expression) {
        final Deque<String> stack = new ArrayDeque<>();

        final String[] tokens = expression.split(" ");
        stack.addAll(Arrays.asList(tokens));

        while (stack.size() > 1) {
            final int left = parseInt(stack.pop());
            final String operator = stack.pop();
            final int right = parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+": {
                    result = left + right;
                    break;
                }
                case "-": {
                    result = left - right;
                    break;
                }
            }
            stack.push(String.valueOf(result));
        }

        return parseInt(stack.poll());
    }
}
