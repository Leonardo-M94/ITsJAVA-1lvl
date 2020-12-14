package ru.itsjava.sorting;

import java.util.Arrays;

public class SortKind {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-2, 8, 4, 3, 0, 5, 9, 1, 7};
        int[] arr2 = new int[]{7, 0, 4, -5, 3, 2, 6, 1, -1, 8};
        int[] arr3 = new int[]{5, 8, -3, -5, 3, 0, 2, 9, -1, 7};

        System.out.println("Source array: " + Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("Bubble sorted array: " + Arrays.toString(arr1));

        System.out.println("Source array: " + Arrays.toString(arr2));
        shakerSort(arr2);
        System.out.println("Shaker sorted array: " + Arrays.toString(arr2));

        System.out.println("Source array: " + Arrays.toString(arr3));
        brushSort(arr3);
        System.out.println("Brush sorted array: " + Arrays.toString(arr3));
    }

    private static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }


    private static void shakerSort(int[] array) {
        int right = array.length - 1;
        int left = 0;
        int temp = 0;

        while (left <= right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

            --right;

            for (int j = right; j > left; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

            ++left;
        }
    }


    private static void brushSort(int[] array){
        if (array.length < 2) return;

        double coeff = 1.247;
        int delta = (int)(array.length / coeff);

        int index1 = 0;
        int index2 = 0;

        int temp = 0;

        while(index1 < delta){
            for (index2 = delta; index2 < array.length; index2++, index1++) {
                if (array[index1] > array[index2]){
                    temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                }
            }

            delta = (int)(delta/coeff);
            index1 = 0;

        }
    }
}
