package main;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Books book1 = new Books("2019.02.11", "Sapkowski", "Poland book company", "50 zl", "600");
        Movies movies1 = new Movies("2018.12.21", "Marvel", "PMC", "35 zl", "English");
        Music music1 = new Music("2019.06.16", "Dana", "Dana inc.", "20 zl", "Dana and music");
        User user2 = new User("Adam", "Czarnecki", "Kominkowa 7", "22", "2020.02.11");
        User user3 = new User("Aleksandra", "Wałek", "Czarna 13", "25", "2019.12.14");
        Rental rental = new Rental();
        rental.rentThing(music1, user2,new Date(2021, 11, 15));
        rental.rentThing(movies1, user3, new Date(2021, 11, 15));

        rental.returnThing(music1, user2, new Date(2021, 12, 25));
        rental.returnThing(movies1, user3, new Date(2021, 11, 25));
        rental.payPenalty(user3);
        System.out.println("Rental history:");
        for(Renting renting : rental.getRentingList()) {
            System.out.println(renting.toString());
        }
        System.out.println(music1);
    }
}