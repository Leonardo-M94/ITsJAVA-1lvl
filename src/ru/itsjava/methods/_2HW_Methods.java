package ru.itsjava.methods;

import java.util.Scanner;

public class _2HW_Methods {
    public static void main(String[] args) {

        // 1. Метод вывода фразы к-раз.
        System.out.println("Метод вывода фразы к-раз:");
        printInCycle(10, "I love Java!");
        System.out.println("");

        // 2. Метод инициализации и вывода целочисленного массива.
        System.out.println("Метод инициализации и вывода целочисленного массива:");
        int[] mas = createArray();
        printArray(mas);
        System.out.println("");

        // 3. Метод вывода целочисленного массива в формате: Массив: {0, 1, 2, 3, 4}
        System.out.println("Метод вывода целочисленного массива:");
        printFormatArray(mas);
        System.out.println("");

        // 4. Метод вывода элементов массива с нечетными индексами
        System.out.println("Метод вывода элементов массива с нечетными индексами:");
        printOddNum(mas);
        System.out.println("");

        // 5. Метод вывода n-элементов массива из начала или конца массива
        System.out.println("Метод вывода n-элементов массива из начала или конца массива: ");
        System.out.println("Из начала:");
        printSelectElements(3, mas, true);
        System.out.println("Из конца: ");
        printSelectElements(3, mas, false);
        System.out.println("");

        // 6. Метод определения минимального элемента в массиве
        System.out.println("Метод определения минимального элемента в массиве:");
        System.out.println(getMinValue(mas));
        System.out.println("");

        // 7. Метод вывода элементов массива, которые делятся на указанное число
        System.out.println("Метод вывода элементов массива, которые делятся на указанное число:");
        printDivisionElements(mas, 3);
        System.out.println("");

        // 8. Метод вычисления суммы элементов с четными идексами в массиве:
        System.out.println("Метод вычисления суммы элементов с четными идексами в массиве:");
        System.out.println(getSumByEvenElements(mas));
        System.out.println("");

        // 9. Метод поиска в массиве первого элемента, который делится на указанное число:
        System.out.println("Метод поиска первого элемента в массиве, который делится на указанное число:");
        System.out.println(getDivisionElement(mas, 3));
        System.out.println("");
    }


    public static void printInCycle(int cRepeat, String phrase) {
        int k = 0;
        while (k < cRepeat) {
            System.out.println((++k) + ") " + phrase);
        }
        System.out.println("");
    }


    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int length = input.nextInt();

        int[] arr = new int[length];
        System.out.println("Введите элементы целочисленного массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        return arr;
    }


    public static void printArray(int[] array) {
        System.out.print("Введенный массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "    ");
        }

        System.out.println("\n" + "Длина массива: " + array.length);
    }


    public static void printFormatArray(int[] mas) {
        System.out.print("Массив: {");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            if (i == (mas.length - 1)) {
                System.out.print("}");
            } else {
                System.out.print(", ");
            }
        }
        if (mas.length == 0) {
            System.out.println(" }");
        }
    }


    public static void printOddNum(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }


    public static void printSelectElements(int countElements, int[] array, boolean head) {
        if (countElements > array.length) return;

        if (countElements == array.length) {
            countElements = 0;
        }

        if (head) {
            for (int i = 0; i < array.length; i++) {
                if (i < countElements)
                    System.out.println("array[" + i + "] = " + array[i]);
                else {
                    break;
                }
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - countElements) {
                    continue;
                } else {
                    System.out.println("array[" + i + "] = " + array[i]);
                }
            }
        }
    }


    public static int getMinValue(int[] array) {
        if (array.length == 0) {
            System.out.println("Error: array is empty!");
            return -1;
        }

        int minInd = 0; // Индекс MIN эелемента массива, по умолчанию начинаем с 0-го индекса.
        for (int i = 1; i < array.length; i++) {
            if (array[minInd] > array[i]) {
                minInd = i;
            }
        }
        return array[minInd];
    }


    public static void printDivisionElements(int[] array, int number) {
        if (array.length == 0) {
            System.out.println("Error: array is empty!");
            return;
        }

        if ((number < 2) && (number > -2)) {
            System.out.println("Error: division by " + number);
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
    }


    public static int getSumByEvenElements(int[] array) {
        if (array.length == 0) {
            System.out.println("Error: array is empty!");
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }


    public static int getDivisionElement(int[] array, int number) {
        if (((number < 2) && (number > -2)) || (array.length == 0)) return -1;

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                index = i;
            }
        }
        return array[index];
    }
}