package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        Stamp stamp1 = new Stamp("Horse", 2, 3, true);
        stamps.add(stamp1);
        stamps.add(new Stamp("Cow", 2, 3, true));
        stamps.add(new Stamp("Dog", 2.5, 3.5, false));
        stamps.add(new Stamp("Horse", 2, 3, false));
        stamps.add(new Stamp("Horse", 2, 3, true));
        stamps.add(new Stamp("Horse", 2, 3, false));
        stamps.add(new Stamp("Horse", 2, 3, true));

        System.out.println("Stamps collection size: " + stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
