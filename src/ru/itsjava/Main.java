package ru.itsjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello, Java!");
        System.out.println("By short command!"); // sout

        int num = 5; // Ctrl + ALt + l

        num += 2;

        System.out.println(num);

        double d1 = 5.0;

        System.out.println(100.0 / 0.0);
        System.out.println(0.0 / 100.0);

//        System.out.println(5 / 0); // Ctrl + /

        boolean isSunny = false;
        System.out.println(isSunny);

        System.out.println(5 > 3);
        System.out.println(5 < 3);
        System.out.println(5 == 5);

        if (num > 5)
            System.out.println("Число больше 5!");
        else if (num < 5)
            System.out.println("Число меньше 5!");
        else System.out.println("Число равно 5!");

    }
}
