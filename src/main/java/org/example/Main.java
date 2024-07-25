package org.example;


public class Main {
    public static void main(String[] args) {


        Employee dev1 = new Developer("Jonas", 5000,"Java");
        Employee man1 = new Manager("Tadas", 5500,"IT");

        System.out.println(dev1.getDetails());
        System.out.println(man1.getDetails());
    }
}