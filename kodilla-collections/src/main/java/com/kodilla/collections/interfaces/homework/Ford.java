package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private double speed;

    public Ford (double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
            speed = speed + 3;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 5;
    }
}
