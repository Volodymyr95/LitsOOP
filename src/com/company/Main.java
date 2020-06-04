package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        Inheritance - DONE
        Encapsulation
        Polymoprpism
        Abstraction?
        OOP - Object oriented programming
         */


        Employee john = new Employee("John");
        System.out.println(john.getFirstName());
        john.setFirstName("Rob");
        System.out.println(john.getFirstName());
        System.out.println(john.isMarried());
        System.out.println(john.getLastName());

    }
}
