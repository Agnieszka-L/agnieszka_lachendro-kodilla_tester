package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car opel = new Opel(80);
        cars.add(opel);
        cars.add(new Ford(90));
        Mazda mazda = new Mazda(100);
        cars.add(mazda);
        cars.add(new Mazda(102));

        System.out.println("All the cars in collection: " + cars.size());

        cars.remove(3);
        System.out.println("Numbers of cars in collection after removing one car: " + cars.size());

        cars.remove(opel);
        System.out.println("Numbers of cars in collection after removing car the the index 0: " + cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
