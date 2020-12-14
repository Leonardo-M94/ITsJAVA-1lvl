package ru.itsjava;

public class CyclesPractice {
    public static void main(String[] args) {    // psvm
        int count = 0;
        while(count < 3)
        {
            System.out.println("Java is interesting!");
            count++;
        }

//        while(true){
//            System.out.println("Infinity cycle!");
//        }

        int[] numbers = new int[]{-3, 0, 5, 4, 6};
        System.out.println(numbers[2]);
        System.out.println(numbers[numbers.length - 1]);

        System.out.println("Array length is " + numbers.length);

        for (int i = 0; i < numbers.length; i++) { // fori
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
