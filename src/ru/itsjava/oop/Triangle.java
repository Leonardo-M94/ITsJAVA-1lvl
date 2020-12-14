package ru.itsjava.oop;

import java.lang.Math;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;

        double hArea = getArea() / 2;
        this.h = (2 * Math.sqrt(hArea * (hArea - a) * (hArea - b) * (hArea - c))) / a;
        System.out.println("This is triangle!");
    }

    public Triangle() {
        super();
        this.a = 0.d;
        this.b = 0.d;
        this.c = 0.d;
        this.h = 0.d;
    }

    @Override
    public double getArea() {
        if ((a <= 0.d) || (b <= 0.d) || (c <= 0.d)) return 0.d;
        else return a + b + c;
    }

    public double getSquare() {
        return a * h / 2;
    }
}
