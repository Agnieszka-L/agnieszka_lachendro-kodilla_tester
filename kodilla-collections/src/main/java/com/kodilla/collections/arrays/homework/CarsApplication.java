package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            Car car = drawCar();
            cars[i] = car;
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Car car = drawRandomCar();
        car.increaseSpeed();
        return car;
    }

    private static Car drawRandomCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        double speed = random.nextDouble() * 100 + 1;
        if (drawnCarBrand == 0)
            return new Ford(speed);
        else if (drawnCarBrand == 1)
            return new Mazda(speed);
        else
            return new Opel(speed);
    }
}
