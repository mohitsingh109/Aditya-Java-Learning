package com.learning.java.inheritance;

public class Main {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper(
                "Mohit",
                "India",
                "7888770232",
                "test@gmail.com",
                "21"
        );

        Manager manager = new Manager(
                "Mohit",
                "India",
                "7888770232",
                "test@gmail.com",
                "Team1"
        );

        javaDeveloper.printDetails(); // Now I am calling my function?
        System.out.println(javaDeveloper.calculateBonus()); // 1000??
        System.out.println(manager.calculateBonus());
    }
}
