package com.company;

import java.util.Arrays;

public class Flat implements Payment{
    private People[] people;
    private String adress;
    private int pay;

    public Flat(String adress, int pay) {
        this.adress = adress;
        this.pay = pay;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public void Comucluga() {
        System.out.println("Flat pay ");
    }

    @Override
    public String toString() {
        return "Flat{" +
                "people=" + Arrays.toString(people) +
                ", adress='" + adress + '\'' +
                ", pay=" + pay +
                '}';
    }
}
