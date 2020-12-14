package ru.itsjava.shop;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Integer;

public class PizzaShop {
    public static void main(String[] args) {
        String[] pizza = new String[]{"4 сыра", "Пеперони", "Президентская", "С морепродуктами", "Студенческая", "Вегетарианская"};

        System.out.println("Добро пожаловать в Мир Пиццы!");

        short command = 0;

        while (true) {
            printMenu();
            System.out.print("Выберите пункт меню: ");
            Scanner input = new Scanner(System.in);

            try {
                command = input.nextShort();
            } catch (InputMismatchException exp) {
                System.out.println("Ошибка! Команда = " + exp.getMessage());
            } finally {
                switch (command) {
                    case 0:     // Выход из программы.
                        System.exit(0);
                        //break;
                    case 1:     // Вывод ассортимента.
                        printProducts(pizza);
                        break;
                    case 2:     // Добавить товар.
                        pizza = addNewProduct(input, pizza);
                        printProducts(pizza);
                        break;
                    case 3:     // Удалить товар.
                        pizza = removeProduct(input, pizza);
                        printProducts(pizza);
                        break;
                    case 4:     // Сортировка ассортимента по возрастанию.
                        shakerSort(pizza, true);
                        printProducts(pizza);
                        break;
                    case 5:     // Сортировка ассортимента по убыванию.
                        shakerSort(pizza, false);
                        printProducts(pizza);
                        break;
                    case 6:     // Поиск товара по названию.
                        searchProduct(pizza);
                        break;
                    case 7:     // Сборка/доставка заказа.
                        System.out.println(orderDelivery(pizza));
                        break;
                    default:
                        System.out.println("Не существующая команда!");
                }
            }

        }
    }


    private static void searchProduct(String[] pizza) {
        if (pizza.length < 1) return;

        System.out.print("Введите запрос: ");
        Scanner inStream = new Scanner(System.in);
        String productName = inStream.nextLine();
        int resultCount = 0;


        for (int i = 0; i < pizza.length; i++) {
            if (pizza[i].toLowerCase().contains(productName.toLowerCase())) {   // Будем выводить все похожие результаты...
                System.out.println(pizza[i] + "\nЗдесь должна быть информация о найденном товаре...");
                resultCount++;
            }
        }

        if (resultCount == 0) {
            System.out.println("По данному запросу ничего не найдено...");
        }
    }


    private static void shakerSort(String[] array, boolean flag) {
        if (array.length < 2) return;

        int right = array.length - 1;
        int left = 0;
        String temp = null;
        int prev, cur, next;

        while (left <= right) {
            for (int i = left; i < right; i++) {

                if (flag) {
                    cur = i;
                    next = i + 1;
                } else {
                    cur = i + 1;
                    next = i;
                }

                if (array[cur].compareTo(array[next]) < 0) {        // S1.compareTo(S2):
                    temp = array[cur];                              // 0 - S1==S2
                    array[cur] = array[next];                       // < 0 - S1 > S2
                    array[next] = temp;                             // > 0 - S1 < S2
                }
            }

            --right;

            for (int j = right; j > left; j--) {
                if (flag) {
                    cur = j;
                    prev = j - 1;
                } else {
                    cur = j - 1;
                    prev = j;
                }

                if (array[cur].compareTo(array[prev]) > 0) {
                    temp = array[cur];
                    array[cur] = array[prev];
                    array[prev] = temp;
                }
            }

            ++left;
        }
    }


    private static String[] removeProduct(Scanner inStream, String[] source) {
        if (source.length < 1) return source;

        System.out.print("Введите название пиццы для удаления из списка: ");
        String delPizza = inStream.next();

        boolean searched = false;
        int k = 0;
        String result = "";

        for (int i = 0; i < source.length; i++) {
            if (!source[i].equalsIgnoreCase(delPizza)) {
                result += source[i] + "/";
            } else {
                searched = true;
            }
        }

        if (!searched) {
            System.out.println("Товар не найден в ассортименте!");
            return source;
        }

        return result.split("/");
    }


    private static String[] addNewProduct(Scanner inStream, String[] source) {
        System.out.print("Введите новый вид пиццы: ");
        String newPizza = inStream.next();

        String[] newPizzaList = new String[source.length + 1];
        for (int i = 0; i < source.length; i++) {
            newPizzaList[i] = source[i];
        }
        newPizzaList[source.length] = newPizza;

        return newPizzaList;
    }


    private static void printProducts(String[] pizza) {
        if (pizza.length < 1) return;

        System.out.println("\nПредлагаем Вам наш ассортимент пиццы:");
        for (int i = 0; i < pizza.length; i++) {
            System.out.println((i + 1) + ") " + pizza[i]);
        }
    }


    private static void printMenu() {
        System.out.println("\nКомандное меню:\n" +
                "1. Вывести ассортимент.\n" +
                "2. Добавить товар.\n" +
                "3. Удалить товар.\n" +
                "4. Соритровка ассортимента по возрастанию.\n" +
                "5. Соритровка ассортимента по убыванию.\n" +
                "6. Поиск товара по запросу.\n" +
                "7. Сборка/доставка заказа.\n" +
                "0. Выход из программы.\n");
    }


    private static String orderDelivery(String[] source) {
        if (source.length < 1) return null;

        printProducts(source);

        System.out.println("\nОформление заказа: ");
        String theEnd = "да";
        String check = "\nЗаказ №***\n";
        int countPosition = 0;

        Scanner inStream = new Scanner(System.in);

        do {
            System.out.println("Введите строку формата: № пиццы - количество (1 - 2)");

            String inLine = inStream.nextLine();

            if ((inLine == null) || (inLine.isEmpty())) continue;

            String position[] = inLine.split("-");
            int index = Integer.parseInt(position[0].trim());
            int count = Integer.parseInt(position[position.length - 1].trim());

            if ((index > source.length) || (count < 1)) continue;

            countPosition++;
            check += source[index - 1];
            check += " - " + count + " шт." + "\n";

            System.out.println("Еще? (Да/Нет): ");
            theEnd = inStream.nextLine().toLowerCase();

        } while (theEnd.equalsIgnoreCase("да"));

        if (countPosition < 1) return null;

        System.out.println("Укажите Ваше ФИО в формате: Иванов Иван Иванович");
        System.out.print("Вас зовут: ");
        String fullName = inStream.nextLine();
        check += "ФИО заказчика: " + fullName + "\n";

        System.out.print("Укажите адрес доставки: ");
        String address = inStream.nextLine();
        check += "Адрес доставки: " + address + "\n";

        System.out.print("Укажите номер телефона: ");
        String telephone = inStream.nextLine();
        check += "Телефон: " + telephone + "\n";

        check += "\nЗаказ принят и находится в обработке.\n";
        check += "Благодарим за заказ! Спасибо за Ваш выбор!";

        return check;
    }
}


// <IF-ELSE> operator small format:
// (condition) ? 1 : 0;
// where 1 if condition == true
// and 0 if condition == false

// Bits operators:
// 1. ~ bit inversion <NOT>
// 2. & bit <AND>: 1101 & 1010 = 1000
// 3. | bit <OR>: 1101 & 1010 = 1111
// 4. ^ bit <XOR>: 1101 & 1010 = 0111
// 5. << bit left shift (*2)
// 6. >> bit right shift (/2)
// 7. >>> zero bit right shift



