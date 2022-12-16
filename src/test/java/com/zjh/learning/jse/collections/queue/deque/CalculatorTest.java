package com.zjh.learning.jse.collections.queue.deque;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by jinhui on 10/10/2016.
 */
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void shouldEvaluateConstants() {
        int result = calculator.evaluate("1");
        assertEquals(1, result);
    }

    @Test
    public void shouldEvaluateAdding() {
        int result = calculator.evaluate("1 + 2");
        assertEquals(3, result);
    }

    @Test
    public void shouldEvaluateSubstraction() {
        int result = calculator.evaluate("1 - 2");
        assertEquals(-1, result);
    }

    @Test
    public void shouldEvaluateComplexExpressions() {
        int result = calculator.evaluate("1 - 2 + 3 + 4");
        assertEquals(6, result);
    }
}
