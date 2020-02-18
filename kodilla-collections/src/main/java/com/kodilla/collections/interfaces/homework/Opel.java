package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private double speed;

    public Opel(double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 2;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 5;
    }

    @Override
    public String toString() {
        return "Opel{" + "speed=" + speed + '}';
    }
}
