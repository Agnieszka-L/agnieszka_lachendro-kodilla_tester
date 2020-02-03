package com.kodilla.inheritance.homework;

public class Runner {
    public static void main(String[] args) {

        Device operatingSystem1 = new Device("Linux", 1991);
        Device operatingSystem2 = new Device("Windows95", 1997);
        Device operatingSystem3 = new Device("Windows10", 2015);
        Device operatingSystem4 = new Device("WindowsXP", 2001);

        operatingSystem1.turnOff();
        operatingSystem2.turnOn();
        operatingSystem1.setReleaseYear();

        Tablet  tablet = new Tablet("Samsung Galaxy","Linux",  2010);
        System.out.println(tablet.getTabletName() + " was issued in " + tablet.getReleaseYear());

        Laptop laptop = new Laptop("Asus", "Windows", 2011);
        System.out.println(laptop.getLaptopName());
        System.out.println(laptop.getLaptopName() + " was realesed in " + laptop.getReleaseYear()+ ".");
    }


}
