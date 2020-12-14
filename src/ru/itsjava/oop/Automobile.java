//    Домашнее задание:
//    Сделать тоже самое для своего собственного класса, что делали для класса Iron.

package ru.itsjava.oop;

public class Automobile {
    // FIELDS
    private String brand;
    private String model;
    private int horsePower;
    private int releaseYear;
    private float engineVolume;

    // CONSTRUCTORS
    public Automobile(){
        brand = "unknown";
        model = "unknown";
        horsePower = 0;
        releaseYear = 0;
        engineVolume = 0.f;
    }

    public  Automobile(String setBrand, String setModel, int setPower, int setYear, float setEngine){
        brand = setBrand;
        model = setModel;

        horsePower = (setPower >= 0) ? setPower : 0;
        releaseYear = (setYear >= 0) ? setYear : 0;
        engineVolume = (setEngine >= 0.f) ? setEngine : 0;
    }

    public  Automobile(String setBrand, String setModel, int setPower){
        brand = setBrand;
        model = setModel;

        horsePower = (setPower >= 0) ? setPower : 0;
    }

    // METHODS
    public String getBrand(){
        return brand;
    }

    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String newModel){
        model = newModel;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public void setHorsePower(int value){
        if (value >= 0){
            horsePower = value;
        }
        else{
            System.out.println("Error format! Horse power must not be a negative number!");
        }
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void setReleaseYear(int newYear){
        if (newYear >= 0){
            releaseYear = newYear;
        }
        else{
            System.out.println("Error format! Release year must not be a negative number!");
        }
    }

    public float getEngineVolume(){
        return engineVolume;
    }

    public void setEngineVolume(float volume){
        if (volume >= 0){
            engineVolume = volume;
        }
        else{
            System.out.println("Error format! Engine year must not be a negative float number!");
        }
    }

    public void printInfo(){
        System.out.println("Auto brand: " + brand + "\nModel: " + model + "\nHorse power: " + horsePower +
                           "\nRelease year: " + releaseYear + "\nEngine volume: " + engineVolume + "\n");
    }
}
