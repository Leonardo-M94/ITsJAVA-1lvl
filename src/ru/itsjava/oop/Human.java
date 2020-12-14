package ru.itsjava.oop;

//    Домашнее задание:
//        Создать отдельный класс человек в котором будет 2 поля имя и возраст.
//        Создать конструктор. Создать Метод, в котором человек здоровается.
//        И в классе Main создать объект класса человек.
//        В классе человек создать гетеры и сеттеры для всех полей.
//        (Если сделали какие-то поля final для них метод set прописать не получится)

public class Human {
    // FIELDS
    private final String name;
    private short age;
    private char gender;

    // CONSTRUCTORS
    public Human(String humanName, char humanGender, int humanAge){
        name = humanName;

        if ((humanAge <= 125) && (humanAge >= 0)){
            age = (short)humanAge;
        }

        humanGender = Character.toLowerCase(humanGender);

        if ((humanGender == 'm') || (humanGender == 'w')){
            gender = humanGender;
        }
    }

    // METHODS
    public void sayHello(){
        System.out.println(name + ": Hello! My name is " + name + ". I`m " + age + " years old.");
    }

    public String getName(){
        return name;
    }

    public short getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = (short)newAge;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char sex){
        if ((sex == 'm') || (sex == 'w')){
            gender = sex;
        }
        else{
            System.out.println("Error format! Gender must been like 'm' or 'w'.");
        }
    }
}
