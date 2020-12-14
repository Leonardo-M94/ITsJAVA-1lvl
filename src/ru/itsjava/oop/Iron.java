package ru.itsjava.oop;

// Создать еще один класс Iron (утюг).
// Прописать 3 любых поля, которыми он характеризуется.
// Сделать максимальное количество конструкторов.
// Прописать set и get методы для каждого из полей.

public class Iron {
    // FIELDS
    private String brand;
    private int power;
    private float cordLength;

    // CONSTRUCTORS
    public Iron(){
        brand = "unknown";
        power = 0;
        cordLength = 0.f;
    }

    public Iron(String brandName, int ironPower, float cord){
        brand = brandName;
        power = (ironPower >= 0) ? ironPower : 0;
        cordLength = (cord >= 0.f) ? cord : 0.f;
    }

    public Iron(String brandName) {
        brand = brandName;
    }

    public Iron(String brandName, float cord){
        brand = brandName;
        cordLength = (cord >= 0.f) ? cord : 0.f;
    }

    public Iron(String brandName, int ironPower){
        brand = brandName;
        power = (ironPower >= 0) ? ironPower : 0;
    }


    // METHODS
    public String getBrand(){
        return brand;
    }

    public void setBrand(String newName){
        brand = newName;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int value){
        if (value >= 0){
            power = value;
        }
        else{
            System.out.println("Error format! Power value must not be as negative integer!");
        }
    }

    public float getCordLength(){
        return cordLength;
    }

    public void setCordLength(float length){
        if (length >= 0.f){
            cordLength = length;
        }
        else{
            System.out.println("Error format! Cord length must not be as negative float number!");
        }
    }
}
