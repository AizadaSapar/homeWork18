package com.company;

public class Hotel implements Pay{
    private String adress;
    private int rent;

    public Hotel(String adress, int rent) {
        this.adress = adress;
        this.rent = rent;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public void Arenda() {
        System.out.println("Hotel pay ");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "adress='" + adress + '\'' +
                ", rent=" + rent +
                '}';
    }
}
