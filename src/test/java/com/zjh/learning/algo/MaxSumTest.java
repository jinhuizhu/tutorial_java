package com.zjh.learning.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Algo - MaxSum")
public class MaxSumTest {

    @DisplayName("Using recursive solution:")
    @Nested
    class RecusriveSolution {
        @Test
        @DisplayName("If the input array contains negative value, it should throw IllegalArgumentException.")
        public void test0() {
            assertThrows(IllegalArgumentException.class, () -> {
                MaxSum.maxSumRecursive(new int[] { 1, 2, -1});
            });
        }

        @Test
        @DisplayName("Empty array: max sum = 0")
        public void test1() {
            assertEquals(0, MaxSum.maxSumRecursive(new int[]{}));
        }

        @Test
        @DisplayName("One-element array: max sum = that element")
        public void test2() {
            assertEquals(2, MaxSum.maxSumRecursive(new int[]{2}));
        }

        @Nested
        @DisplayName("Multi-element array:")
        class MultiElementArray {
            @Test
            @DisplayName("[2, 3] = 3")
            public void test3() {
                assertEquals(3, MaxSum.maxSumRecursive(new int[]{2, 3}));
            }

            @Test
            @DisplayName("[1, 2, 3] = 4")
            public void test4() {
                assertEquals(4, MaxSum.maxSumRecursive(new int[]{1, 2, 3}));
            }

            @Test
            @DisplayName("[2, 13, 18, 10] = ")
            public void test5() {
                assertEquals(23, MaxSum.maxSumRecursive(new int[]{2, 13, 18, 10}));
            }

            @Test
            @DisplayName("[1, 9, 18, 10, 2, 3] = 22")
            public void test6() {
                assertEquals(22, MaxSum.maxSumRecursive(new int[]{1, 9, 18, 10, 2, 3}));
            }

            @Test
            @DisplayName("[100, 9, 18, 10, 3] = 121")
            public void test7() {
                assertEquals(121, MaxSum.maxSumRecursive(new int[]{100, 9, 18, 10, 3}));
            }

            @Test
            @DisplayName("[3, 1, 2, 9, 15, 18, 16, 50, 1, 24] = 104")
            public void test9() {
                assertEquals(104, MaxSum.maxSumRecursive(new int[]{3, 1, 2, 9, 15, 18, 16, 50, 1, 24}));
            }
        }
    }

    @DisplayName("Using iterative solution: ")
    @Nested
    class IterativeSolution {

        @Test
        @DisplayName("If the input array contains negative value, it should throw IllegalArgumentException.")
        public void test0() {
            assertThrows(IllegalArgumentException.class, () -> {
                MaxSum.maxSumIterative(new int[] { 1, 2, -1});
            });
        }

        @Test
        @DisplayName("Empty array: max sum = 0")
        public void test1() {
            assertEquals(0, MaxSum.maxSumIterative(new int[]{}));
        }

        @Test
        @DisplayName("One-element array: max sum = that element")
        public void test3() {
            assertEquals(2, MaxSum.maxSumIterative(new int[]{2}));
        }

        @Nested
        @DisplayName("Multi-element array:")
        class MultiElementArray {
            @Test
            @DisplayName("[2, 3] = 3")
            public void test3() {
                assertEquals(3, MaxSum.maxSumIterative(new int[]{2, 3}));
            }

            @Test
            @DisplayName("[4, 3] = 4")
            public void test4() {
                assertEquals(4, MaxSum.maxSumIterative(new int[]{4, 3}));
            }

            @Test
            @DisplayName("[1, 2, 3] = 4")
            public void test5() {
                assertEquals(4, MaxSum.maxSumIterative(new int[]{1, 2, 3}));
            }

            @Test
            @DisplayName("[2, 13, 1, 10, 20] = 33")
            public void test6() {
                assertEquals(33, MaxSum.maxSumIterative(new int[]{2, 13, 1, 10, 20}));
            }

            @Test
            @DisplayName("[1, 9, 18, 10, 2, 3] = 22")
            public void test7() {
                assertEquals(22, MaxSum.maxSumIterative(new int[]{1, 9, 18, 10, 2, 3}));
            }

            @Test
            @DisplayName("[100, 9, 18, 10, 3] = 121")
            public void test8() {
                assertEquals(121, MaxSum.maxSumIterative(new int[]{100, 9, 18, 10, 3}));
            }

            @Test
            @DisplayName("[3, 1, 2, 9, 15, 18, 16, 50, 1, 24] = 104")
            public void test9() {
                assertEquals(104, MaxSum.maxSumIterative(new int[]{3, 1, 2, 9, 15, 18, 16, 50, 1, 24}));
            }
        }
    }
}
