package com.kodilla.abstracts.homework;

public class ApplicationPerson {
    public static void main(String[] args) {
        Job mechanic = new Mechanic();
        Job driver = new Driver();
        Job accountant = new Accountant();

        Person personJonh = new Person("John",20);
        Person personRick = new Person("Rick",25);
        Person personKelly = new Person("Kelly",30);

        personJonh.personsResponsibilities(mechanic);
        personRick.personsResponsibilities(driver);
        personKelly.personsResponsibilities(accountant);
    }
}
