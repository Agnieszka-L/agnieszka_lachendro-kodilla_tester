package com.kodilla.abstracts.homework;

public abstract class Job {
    double salary;
    String responsibilites;

    public Job(double salary, String responsibilities){
        this.salary = salary;
        this.responsibilites = responsibilities;
    }

    public double getSalary(){
        return salary;
    }

    public String getResponsibilites(){
        return responsibilites;
    }
}
