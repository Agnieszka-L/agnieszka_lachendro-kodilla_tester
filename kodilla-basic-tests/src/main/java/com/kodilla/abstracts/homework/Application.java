package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square(8);
        System.out.println("The " + square.getName() + " is " + square.getColor());
        System.out.println("The area of "+ square.getName() + " is " + square.calculateArea());
        System.out.println("The perimeter of "+ square.getName() + " is " + square.calculatePerimeter());

        Shape rectangle = new Rectangle(3,4);
        System.out.println("The " + rectangle.getName() + " is " + rectangle.getColor());
        System.out.println("The area of "+ rectangle.getName() + " is " + rectangle.calculateArea());
        System.out.println("The perimeter of " + rectangle.getName() + " is " + rectangle.calculatePerimeter());

        Shape circle = new Circle(3.5);
        System.out.println("The " + circle.getName() + " is " + circle.getColor());
        System.out.println("The area of "+ circle.getName() + " is " + circle.calculateArea());
        System.out.println("The perimeter of " + circle.getName() + " is " + circle.calculatePerimeter());



    }
}
