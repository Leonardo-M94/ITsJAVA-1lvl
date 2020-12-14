package ru.itsjava;

public class ForthHomeWork {
    public static void main(String[] args) {

        int[] array = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        System.out.println("Работаем с массивом чисел: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
//----------------------------------------------------------------------------


        System.out.println("Выведем элементы массива с нечетными индексами:");
        // По теме либо такой цикл:
        // for (int i = 1; i < array.length; i += 2)
        for (int i = 0; i < array.length; i++) {
            if (i % 2 > 0){
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
        System.out.println("");
//----------------------------------------------------------------------------


        System.out.println("Выведем первые 4 элемента массива:");
        // Вариант с оператором break, но можно i ограничить до 4.
        for (int i = 0; i < array.length; i++) {
            if (i < 4)
                System.out.println("array[" + i + "] = " + array[i]);
            else{
                break;
            }
        }
        System.out.println("");
//----------------------------------------------------------------------------


        System.out.println("Выведем последние 4 элемента массива:");
        // Вариант с оператором continue, но можно применить такой цикл:
        // for (int i = array.length - 4; i < array.length; i++)
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 4){
                continue;
            }
            else{
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
        System.out.println("");
//----------------------------------------------------------------------------


        System.out.println("Определим минимальный элемент массива.");
        int minInd = 0; // Индекс MIN эелемента массива, по умолчанию начинаем с 0-го индекса.
        for (int i = 1; i < array.length; i++) {
            if (array[minInd] > array[i]){
                minInd = i;
            }
        }
        System.out.println("MIN элемент массива: array[" + minInd + "] = " + array[minInd]);
        System.out.println("");
//----------------------------------------------------------------------------


        System.out.println("Выведем элементы массива, которые делятся на 5:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0){
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
        System.out.println("");
//----------------------------------------------------------------------------


        System.out.println("Определим сумму элементов с четными идексами:");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }
        System.out.println("= " + sum);
        System.out.println("");
//----------------------------------------------------------------------------


        System.out.println("Определим первый элемент массива, который делится на 5:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0){
                System.out.println("Это array[" + i + "] = " + array[i]);
                break;
            }
        }
    }
}
