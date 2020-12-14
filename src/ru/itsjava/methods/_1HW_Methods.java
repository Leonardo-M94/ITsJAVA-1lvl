package ru.itsjava.methods;

public class _1HW_Methods {

    public static void main(String[] args) {
        System.out.println("Call getMinValue(2, 6): " + getMinValue(2, 6) + "\n");

        System.out.print("Call v.1 printMinValue(5, 0): ");
        printMinValue(5, 0);
        System.out.print("Call v.2 printMinValue(5, 0): ");
        _printMinValue(5, 0);
        System.out.println("");

        System.out.print("Call v.1 printEqualityValues(7, 4): ");
        printEqualityValues(7, 4);
        System.out.print("Call v.2 printEqualityValues(7, 4): ");
        _printEqualityValues(7, 4);
    }



    //  1. Написать метод по вычислению минимума из двух чисел
    public static int getMinValue(int num1, int num2){
        if (num1 < num2) return num1;
        return num2;
    }



    //  2. Написать метод, который печатает минимум из двух чисел
    // Вариант 1:
    public static void printMinValue(int num1, int num2){
        if (num1 < num2){
            System.out.println("Min value = " + num1);
        }
        else{
            System.out.println("Min value = " + num2);
        }
    }

    // Выриант 2:
    public static void _printMinValue(int num1, int num2){
        System.out.println("Min value = " + getMinValue(num1, num2));
    }



    //  3. Написать метод, который печатает равны или не равны два числа.
    // Вариант 1:
    public static void printEqualityValues(int num1, int num2){
        if (num1 == num2){
            System.out.println(num1 + " equals to " + num2);
        }
        else{
            System.out.println(num1 + " does not equal to " + num2);
        }
    }

    // Вариант 2:
    public static void _printEqualityValues(int num1, int num2){
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
    }
}