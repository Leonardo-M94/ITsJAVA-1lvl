package ru.itsjava.oop;

public class Circle extends Figure {
    private double radius;
    public final static double PI = 3.14;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double getArea() {
        return 2 * PI * radius;
    }

    @Override
    public double getSquare() {
        return PI * radius * radius;
    }
}
