package com.kodilla.abstracts.homework;

public class Circle extends Shape {
     double radius;
     final double PI = 3.14;

    public Circle(double radius) {
        super("koło", "green");
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return PI*Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
         return  2*PI*radius;
    }
}
