package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;


    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }

    public void personsResponsibilities (Job job){
        System.out.println(getFirstName() + " is " + getAge() + " years old and " + job.responsibilites);
    }
}
