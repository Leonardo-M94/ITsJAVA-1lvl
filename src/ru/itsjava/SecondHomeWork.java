package ru.itsjava;

import java.util.Scanner;

public class SecondHomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Определяем MAX из двух чисел.");
        System.out.print("Введите 1-е число: ");
        int num1 = input.nextInt();
        System.out.print("Введите 2-е число: ");
        int num2 = input.nextInt();

        if (num1 > num2)
            System.out.println("MAX = " + num1);
        else if (num2 > num1)
            System.out.println("MAX = " + num2);
        else System.out.println("Введенные числа равны!");
        System.out.println("");

        //---------------------------------------------------

        System.out.println("Определяем MIN из трех чисел.");
        System.out.print("Введите 1-е число: ");
        num1 = input.nextInt();
        System.out.print("Введите 2-е число: ");
        num2 = input.nextInt();
        System.out.print("Введите 3-е число: ");
        int num3 = input.nextInt();

        int temp = num1;
        if (temp > num2) temp = num2;
        if (temp > num3) temp = num3;
        System.out.println("MIN = " + temp);
        System.out.println("");

        //---------------------------------------------------

        System.out.println("Программа 'Призывник'");
        System.out.println("Введите возраст человека: ");
        int age = input.nextInt();

        if (age < 0 || age > 100)
            System.out.println("Введенный возраст некорректен!");
        else if (age >= 0 && age < 18)
            System.out.println("Возраст еще слишком мал!");
        else if (age >= 18 && age < 27)
            System.out.println("Возраст пригоден для службы!");
        else System.out.println("Поздний возраст для службы!");
        System.out.println("");

        //---------------------------------------------------

        System.out.print("Меняем местами значения двух переменных: ");
        num1 = 3;
        num2 = 5;
        System.out.println("num1 = " + num1 + " и num2 = " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Замена выполнена! num1 = " + num1 + " num2 = " + num2);
        System.out.println("");

        //---------------------------------------------------

        System.out.println("Введите коэффициенты квадратного уравнения: ");
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();

        double D = b * b - 4 * a * c;
        if (D > 0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: х1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0){
            double x = -b / (2 * a);
            System.out.println("Корень уравнения: х = " + x);
        }
        else System.out.println("Корней нет!");
    }
}







