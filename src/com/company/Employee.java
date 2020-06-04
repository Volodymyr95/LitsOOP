package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;
    private double salary;
    private String  skills;

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public Employee(String firstName, String lastName, int age, boolean isMarried, double salary, String skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
        this.salary = salary;
        this.skills = skills;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.matches("")){

        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.matches("")){

        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {

        }
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <-1) {

        }
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
