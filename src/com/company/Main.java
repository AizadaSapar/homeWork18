package com.company;

import java.io.FilterOutputStream;

public class Main {

    public static void main(String[] args) {
        People people1 = new People("NurMuxamat");
        People people2 = new People("Ulan");
        People people3 = new People("Ainura");
        People people4 = new People("Guljan");
        People people5 = new People("Maksat");
        People people6 = new People("Datka");
        People people7 = new People("Adilet");
        People people8 = new People("Aizada");
        People people10 = new People("Aruuke");
        People people11 = new People("Nurbek");

        People[] kvar = {people1, people2, people4};
        People[] hostel = {people11, people10, people8, people7, people6, people5, people4, people5, people6};
        People[] hotel = {people1, people2, people4, people5, people3, people6, people11};

        int count = 0;
        for (People people9 : kvar) {
            count++;
        }
        int con = 0;
        for (People people12 : hostel) {
            con++;
        }
        int coun = 0;
        for (People people15 : hotel) {
            coun++;
        }
        Flat kvartira = new Flat("Нарын!", 3000);
        System.out.println(kvartira);
        System.out.println("Проживают: " + count + " человека");
        kvartira.Comucluga();
        System.out.println("-------------------------");
        Hostel gostinica = new Hostel("Бишкек!", 12000);
        System.out.println(gostinica);
        System.out.println("Проживают: " + coun + " человека");
        gostinica.Arenda();
        System.out.println("-------------------------");
        Hotel obshejitie = new Hotel("Талас!", 6000);
        System.out.println(obshejitie);
        System.out.println("Проживают: " + con + " человека");
        obshejitie.Arenda();

    }


}

