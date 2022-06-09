package com.company;

public class Hostel implements Pay{
    private String name;
    private int rent;

    public Hostel(String name, int rent) {
        this.name = name;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public void Arenda() {
        System.out.println("Hostel pay" );
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", rent=" + rent +
                '}';
    }
}
