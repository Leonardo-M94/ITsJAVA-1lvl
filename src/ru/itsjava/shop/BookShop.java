package ru.itsjava.shop;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        System.out.println("Мы рады приветствовать Вас в нашем магазине книг!\n");

        String[] books = new String[]{"Философия_Java", "Изучаем_Java", "Совершенный_код", "Harry_Potter"};

        printMenu();

        System.out.print("\nВведите номер меню: ");
        Scanner console = new Scanner(System.in);

        int menuNum = console.nextInt();

        while (true) {
            switch (menuNum) {
                case 0:
                    System.out.println("\nСпасибо, что вы воспользовались нашим магазином!\n");
                    System.exit(0);
                    break;
                case 1:
                    printBooks(books);
                    break;
                case 2:
                    books = addBook(console, books);
                    break;
                case 3:
                    books = removeBook(console, books);
                    break;
                case 4:
                    bubbleSort(books);
                    break;
                default:
                    System.out.println("Несуществующая команда!");
            }

            System.out.print("Введите номер меню: ");
            menuNum = console.nextInt();
        }

    }

    private static String[] removeBook(Scanner console, String[] books) {
        System.out.print("Введите название книги: ");
        String bookName = console.next();
        String[] resArray = new String[books.length-1];

        int delIndex;
        for (delIndex = 0; delIndex < books.length; delIndex++) {
            if (books[delIndex].equals(bookName)){
                break;
            }
            else{
                resArray[delIndex] = books[delIndex];
            }
        }

        for (int i = delIndex; i < resArray.length; i++) {
            resArray[i] = books[i + 1];
        }

        return resArray;
    }

    private static String[] addBook(Scanner console, String[] books) {
        System.out.print("Введите название книги: ");
        String bookName = console.next();
        String[] resArray = new String[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            resArray[i] = books[i];
        }
        resArray[books.length] = bookName;
        return resArray;
    }

    private static void printBooks(String[] books) {
        System.out.println("Список всех книг: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + "\t");
        }
        System.out.println("\n");
    }


    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Вывести все книги.\n" +
                "2. Добавить книгу.\n" +
                "3. Удалить книгу.\n" +
                "4. Отсортировать книги.\n" +
                "0. Выход.");
    }

    private static void bubbleSort(String[] books) {
        for (int j = 0; j < books.length; j++) {
            for (int i = 0; i < books.length - j - 1; i++) {
                if (books[i].charAt(0) > books[i + 1].charAt(0)) {
                    String temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                }
            }
        }
    }

}

// Меню:
// 1. Вывести все книги.
// 2. Добавить книгу.
// 3. Удалить книгу.
// 4. Отсортировать книги.
// 5. Выход.
