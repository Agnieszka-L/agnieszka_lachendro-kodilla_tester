package com.kodilla.inheritance.homework;

public class Laptop extends Device {

    private String laptopName;


    public Laptop(String laptopName, String operatingSystemName, int releaseYear) {
        super(operatingSystemName, releaseYear);
        this.laptopName = laptopName;

    }

    public String getLaptopName() {
        return laptopName;
    }

}
