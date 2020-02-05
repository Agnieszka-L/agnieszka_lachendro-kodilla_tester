package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(int length, int width) {
        super("prostokat", "blue");
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return (2*length)+(2*width);
    }
}
