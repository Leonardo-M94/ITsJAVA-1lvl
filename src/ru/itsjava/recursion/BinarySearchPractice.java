package ru.itsjava.recursion;

import java.util.Arrays;

public class BinarySearchPractice {

    public static void main(String[] args) {
        // 1. Sorted massive.
        // Find element position at massive.

        int[] array = new int[]{-6, -3, -2, 0, 1, 5, 6, 7, 8};

        int pos0 = binarySearch(0, 0, array.length, array);
        System.out.println("Position '0' at massive " + Arrays.toString(array) + " equals " + pos0);

        int posMin6 = binarySearch(-6, 0, array.length, array);
        System.out.println("Position '-6' at massive " + Arrays.toString(array) + " equals " + posMin6);

        int pos8 = binarySearch(8, 0, array.length, array);
        System.out.println("Position '8' at massive " + Arrays.toString(array) + " equals " + pos8);
    }

    private static int binarySearch(int num, int beginIndex, int endIndex, int[] array) {
        int midIndex = beginIndex + (endIndex - beginIndex) / 2;

        // Base event
        if (num == array[midIndex]) return midIndex;

        if (num > array[midIndex]) return binarySearch(num, midIndex + 1, endIndex, array);

        return binarySearch(num, beginIndex, midIndex - 1, array);
    }

}
