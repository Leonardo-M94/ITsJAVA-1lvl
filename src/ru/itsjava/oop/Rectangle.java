package ru.itsjava.oop;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(){
        super();
        this.a = 0.d;
        this.b = 0.d;
    }

    public Rectangle(double a, double b){
        super();
        this.a = a;
        this.b = b;
        System.out.println("This is rectangle!");
    }

    @Override
    public double getArea() {
        if ((a <= 0.d) || (b <= 0.d)) return 0.d;
        else return 2.d * (a + b);
    }

    @Override
    public double getSquare() {
        if ((a <= 0.d) || (b <= 0.d)) return 0.d;
        else return a * b;
    }
}
