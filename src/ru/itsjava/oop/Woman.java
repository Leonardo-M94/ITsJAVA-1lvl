package ru.itsjava.oop;

public class Woman extends Person {

    public Woman(String setName, int setAge){
        super(setName, false, setAge);
    }

    public Woman(String setName){
        super(setName, false);
    }

    @Override
    public void printAge() {
        System.out.println("I`m always 18! - Woman");
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

}
