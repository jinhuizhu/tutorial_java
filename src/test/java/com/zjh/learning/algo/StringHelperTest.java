package com.zjh.learning.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Algo - SymmetricString")
public class StringHelperTest {

    @Test
    @DisplayName("Blank string is symmetric.")
    public void test1() {
        assertTrue(StringHelper.isSymmetric(null));
        assertTrue(StringHelper.isSymmetric(""));
        assertTrue(StringHelper.isSymmetric("  "));
    }

    @Test
    @DisplayName("Single char string is symmetric.")
    public void test2() {
        assertTrue(StringHelper.isSymmetric("a"));
    }

    @Nested
    @DisplayName("Multi-Char string test cases:")
    class MultiCharStringTests {
        @Test
        @DisplayName("aa - true")
        public void test3() {
            assertTrue(StringHelper.isSymmetric("aa"));
        }

        @Test
        @DisplayName("ab - false")
        public void test4() {
            assertFalse(StringHelper.isSymmetric("ab"));
        }

        @Test
        @DisplayName("abba - true")
        public void test5() {
            assertTrue(StringHelper.isSymmetric("abba"));
        }

        @Test
        @DisplayName("abcba - true")
        public void test6() {
            assertTrue(StringHelper.isSymmetric("abcba"));
        }

        @Test
        @DisplayName("abccba - true")
        public void test7() {
            assertTrue(StringHelper.isSymmetric("abccba"));
        }

        @Test
        @DisplayName("abccbac - false")
        public void test8() {
            assertFalse(StringHelper.isSymmetric("abccbac"));
        }
    }
}
