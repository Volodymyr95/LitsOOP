package com.company;

public class Manager extends Employee {

    String project;

    public Manager(String firstName, String project) {
        super(firstName); // this.Employee.firstName;
        this.project = project;

    }


}
