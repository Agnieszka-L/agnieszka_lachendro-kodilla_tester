package com.kodilla.abstracts.homework;

public abstract class Shape {

    private String name;
    private String color;


    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
