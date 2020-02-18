package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {

    private double speed;

    public Mazda (double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 4;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 5;
    }

    @Override
    public String toString() {
        return "Mazda{" + "speed=" + speed + '}';
    }
}
