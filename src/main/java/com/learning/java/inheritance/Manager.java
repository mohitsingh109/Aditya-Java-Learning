package com.learning.java.inheritance;

public class Manager extends Person {

    private String teamName;

    public Manager(String name, String address, String phoneNumber, String email, String teamName) {
        super(name, address, phoneNumber, email);
        this.teamName = teamName;
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + 500;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
