package com.zjh.learning.algo;

import java.util.Arrays;

public class MaxSum {


    /**
     * Get the max possible sum of all elements, with restriction:   can't take two elements next to each other.
     * Using recursive solution.
     * @param array
     * @return
     */
    public static int maxSumRecursive(int[] array) {
        verifyArrayNotContainingNegativeIntegers(array);

        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }

        int[] previous = Arrays.copyOf(array, array.length - 1);
        int[] previousPrevious = Arrays.copyOf(array, array.length - 2);

        return Math.max(
                maxSumRecursive(previous),
                maxSumRecursive(previousPrevious) + array[array.length - 1]);
    }

    private static void verifyArrayNotContainingNegativeIntegers(int[] array) {
        for (int i : array) {
            if (i < 0) {
                throw new IllegalArgumentException("Input array can't contain negative value, but was: " + array);
            }
        }
    }

    /**
     * Get the max possible sum of all elements, with restriction:   can't take two elements next to each other.
     * Using iterative solution.
     * @param array
     * @return
     */
    public static int maxSumIterative(int[] array) {
        verifyArrayNotContainingNegativeIntegers(array);

        int[] maxSumTemp = new int[array.length];

        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return array[0] > array[1] ? array[0] : array[1];
        }

        maxSumTemp[0] = array[0];
        maxSumTemp[1] = array[0] > array[1] ? array[0] : array[1];

        for (int i = 2; i < array.length; i++) {
            int previous = maxSumTemp[i-1];
            int previousPrevious = maxSumTemp[i-2] + array[i];

            if (previous >= previousPrevious) {
                maxSumTemp[i] = previous;
            } else {
                maxSumTemp[i] = previousPrevious;
            }
        }

        return maxSumTemp[array.length - 1];
    }
}
