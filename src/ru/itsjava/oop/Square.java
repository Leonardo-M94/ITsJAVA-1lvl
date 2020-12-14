package ru.itsjava.oop;

public class Square extends Figure{
    private double a;

    public Square(){
        super();
        this.a = 0.0;
    }

    public Square(double a){
        super();
        this.a = a;
        System.out.println("This is square!");
    }

    @Override
    public double getArea() {
        if (a <= 0.d) return 0.d;
        else return 4.d * a;
    }

    @Override
    public double getSquare() {
        if (a <= 0.d) return 0.d;
        else return a * a;
    }
}
