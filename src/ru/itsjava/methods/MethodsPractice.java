package ru.itsjava.methods;

public class MethodsPractice {
    public static void main(String[] args) {
//        int num1 = 15;
//        int num2 = 7;
//
//        if (num1 > num2) {
//            System.out.println("Max num: " + num1);
//        } else {
//            System.out.println("Max num: " + num2);
//        }
//
//        int num3 = 16;
//        int num4 = 10;
//
//        if (num3 > num4) {
//            System.out.println("Max num: " + num3);
//        } else {
//            System.out.println("Max num: " + num4);
//        }

        printMaxValue(15, 7);
        printMaxValue(16, 10);

        System.out.println("Max value from 3 and 12: ");
        System.out.println("getMaxValue(3, 12) + 10 = " + (getMaxValue(3, 12) + 10));
    }

    public static void printMaxValue(int num1, int num2){
        if (num1 > num2) {
            System.out.println("Max num: " + num1);
        } else {
            System.out.println("Max num: " + num2);
        }
    }


    // Find max value and incremented on 10 unit
    public static int getMaxValue(int num1, int num2){
        if (num1 > num2) return num1;
        return num2;
    }

}
