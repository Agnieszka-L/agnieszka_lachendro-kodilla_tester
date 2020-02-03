package com.kodilla.inheritance.homework;

public class Tablet extends Device {

    private String tabletName;


    public Tablet(String tabletName, String operatingSystemName, int releaseYear) {
        super(operatingSystemName, releaseYear); //super wywoluje konstruktor z klasy Device(klasa nadrzedna)//

        this.tabletName = tabletName;

    }

    public String getTabletName() {
        return tabletName;
    }


}

