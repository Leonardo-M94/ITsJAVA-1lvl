package ru.itsjava;

import java.util.Scanner;

public class ThirdHomeWork {
    public static void main(String[] args) {
        int k = 0;
        while (k < 10){
            System.out.println((k+1) + ") Я люблю Java!");
            k++;
        }
        System.out.println("");
        //---------------------------------------


        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Введите элементы целочисленного массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        System.out.println("3-й элемент массива равен: " + arr[2]);
        System.out.println("5-й элемент массива равен: " + arr[4]);
        System.out.println("Длина массива равна: " + arr.length);
        System.out.println("");
        //---------------------------------------


        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ") Я люблю писать программы на Java!");
        }
        System.out.println("");
        //---------------------------------------


        int[] mas = new int[]{3, 5, 0, 4, -1};
        System.out.print("Массив: {");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            if (i == (mas.length - 1)){
                System.out.print("}");
            }
            else{
                System.out.print(", ");
            }
        }
    }
}
