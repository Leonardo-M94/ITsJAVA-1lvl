package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Line is the best class in the world!");

        String str = "It is the best line!";
        String str2 = "It is the best line!";

        // Bad comparison: links comparison (ссылаются ли переменные на одну и ту же строку)
        System.out.println(str == str2);

        // Right comparison.
        System.out.println("Lines equal: " + str.equals(str2));
        System.out.println("str.charAt(2): " + str.charAt(3));
        System.out.println("str.length(): " + str.length());
    }
}
