package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car opel = new Opel (100);
        doRace(opel);

        Car mazda = new Mazda(100);
        doRace(mazda);

        Car ford = new Ford(100);
        doRace(ford);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
