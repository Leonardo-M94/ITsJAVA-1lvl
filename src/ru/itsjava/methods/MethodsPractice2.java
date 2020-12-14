package ru.itsjava.methods;

import java.util.Arrays;

public class MethodsPractice2 {
    public static void main(String[] args) {

        int[] array = new int[]{1, -2, 0, 3};
        int num = 5;

        arrayToZeroArray(array);
        System.out.println(Arrays.toString(array));

        num = numToZero(num);
        System.out.println(num);

    }

    public static void arrayToZeroArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
    }


    public static int numToZero(int num){
        num = 0;
        return num;
    }
}
