package com.kodilla.inheritance.homework;

public class Device {

    private String operatingSystemName;
    private int releaseYear;

    public Device(String name, int releaseYear) {
        this.operatingSystemName = name;
        this.releaseYear = releaseYear;
    }

    public void turnOn() {

        System.out.println(operatingSystemName + " is turning on.");
    }

    public void turnOff() {
        System.out.println(operatingSystemName + " is turning off.");
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear() {
        System.out.println(operatingSystemName + " was released in " + releaseYear + ".");
    }
}
