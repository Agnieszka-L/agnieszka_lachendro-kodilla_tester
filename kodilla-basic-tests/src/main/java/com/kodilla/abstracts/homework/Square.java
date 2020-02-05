package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double length;

    public Square(int length){
        super("kwadrat", "blue");
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length*length;
    }

    @Override
    public double calculatePerimeter() {
         return length * length;
    }
}