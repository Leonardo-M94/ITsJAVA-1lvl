package ru.itsjava.recursion;

public class _3HW_Recursion {

    public static void main(String[] args) {
        System.out.println("Fibonachi number at 0-th position: " + getFibonachi(0));
        System.out.println("Fibonachi number at 1-th position: " + getFibonachi(1));
        System.out.println("Fibonachi number at 5-th position: " + getFibonachi(5));
        System.out.println("Fibonachi number at 8-th position: " + getFibonachi(8));
        System.out.println("Fibonachi number at 10-th position: " + getFibonachi(10));
    }

//    1. Числа Фибоначчи: посчитать n -й член последовательности Фибоначчи 1 1 2 3 5 8 13 21

    public static int getFibonachi(int n){

        // Base event
        if (n == 0) return 0;
        if ((n == 1 )|| (n ==2)) return 1;

        // Recursion step
        return getFibonachi(n - 1) + getFibonachi(n - 2);
    }
}
