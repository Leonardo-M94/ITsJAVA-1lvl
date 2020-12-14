package ru.itsjava.recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        System.out.println("Factorial 5! = " + factorial(5));
        System.out.println("Factorial 1! = " + factorial(1));
        System.out.println("Factorial 0! = " + factorial(0));
        System.out.println(factorial(-5));
    }


    public static int factorial(int num){
        if (num < 0){
            System.err.println("Factorial for " + num + " not determined!");
            return -1;
        }

        if ((num == 0) || (num == 1)) return 1; // Base event or exit condition

        return (num * factorial(num - 1)); // Transition condition or recursion continue
    }
}
// 0! = 1! = 1
// 5! = 5 * 4 * 3* 2 * 1

// 5! = 5 * 4!
// 4! = 4 * 3!
// 3! = 3 * 2!
// 2! = 2 * 1!
// 1! = 1
