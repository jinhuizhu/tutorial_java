package com.zjh.learning.algo;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Algo - BalancingBraces")
public class BalancingBracesTest {
    @Test
    @DisplayName("Blank strings are balanced")
    public void test1() {
        assertTrue(BalancingBrace.hasBalancingBraces(null));
        assertTrue(BalancingBrace.hasBalancingBraces(""));
        assertTrue(BalancingBrace.hasBalancingBraces("  "));
    }

    @Test
    @DisplayName("If a string doesn't contain braces, then it's balanced.")
    public void test2() {
        assertTrue(BalancingBrace.hasBalancingBraces("abc"));
    }

    @Nested
    @DisplayName("Strings with braces:")
    class StringsWithBraces {
        @Test
        @DisplayName("(ab) - true")
        public void test1() {
            assertTrue(BalancingBrace.hasBalancingBraces("(ab)"));
        }

        @Test
        @DisplayName(")ab( - false")
        public void test2() {
            assertFalse(BalancingBrace.hasBalancingBraces(")ab("));
        }

        @Test
        @DisplayName("(ab)) - false")
        public void test3() {
            assertFalse(BalancingBrace.hasBalancingBraces("(ab))"));
        }

        @Test
        @DisplayName("  ( (ab ) ) - true")
        public void test4() {
            assertTrue(BalancingBrace.hasBalancingBraces("  ( (ab ) )"));
        }

        @Test
        @DisplayName("  ) ab csdrqwer () - false")
        public void test5() {
            assertFalse(BalancingBrace.hasBalancingBraces("  ) ab csdrqwer ()"));
        }
    }
}
