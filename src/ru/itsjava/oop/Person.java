package ru.itsjava.oop;

public class Person {

    final private boolean isMale;
    final private String name;
    private int age;


    public Person(String name, boolean isMale){
        this.name = name;
        this.isMale = isMale;
        this.age = -1;
    }


    public Person(String name, boolean male, int age){
        this.name = name;
        this.isMale = male;
        this.age = age;
    }


    public void printAge(){
        System.out.print(age + " - ");
        if (isMale){
            System.out.println("Man");
        }
        else{
            System.out.println("Woman");
        }

    }

}
