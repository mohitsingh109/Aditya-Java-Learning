package com.example.inheritance;

public class JavaDeveloper extends Person {

    private String javaVersion;

    @Override // function overriding
    public void printDetails() {
        // person
        super.printDetails(); // I am calling parent function
        //I'll add my custom output as well
        System.out.println("Java Version: " + javaVersion);
    }

    public JavaDeveloper(String name, String address, String phoneNumber, String email, String javaVersion) {
        super(name, address, phoneNumber, email); // parent constructor
        this.javaVersion = javaVersion;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }
}
