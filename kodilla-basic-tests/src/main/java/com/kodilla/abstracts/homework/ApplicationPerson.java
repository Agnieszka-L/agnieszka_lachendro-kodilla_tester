package com.kodilla.abstracts.homework;

public class ApplicationPerson {
    public static void main(String[] args) {
        Job mechanic = new Mechanic();
        Job driver = new Driver();
        Job accountant = new Accountant();

        Person personJohn = new Person("John", 20, mechanic);
        Person personRick = new Person("Rick", 25, driver);
        Person personKelly = new Person("Kelly", 30, accountant);

        personJohn.printResponsibilities();
        personRick.printResponsibilities();
        personKelly.printResponsibilities();
    }
}
