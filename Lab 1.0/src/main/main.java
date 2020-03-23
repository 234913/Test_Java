package main;

import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int temperatura1 = in.nextInt();

        System.out.println("Podaj liczbę");
        int temperatura2 = in.nextInt();
        if ((temperatura1<100) || (temperatura2<100))
        {
            System.out.println("Przynajmniej jedna z temp jest mniejsza od 100");
        }
    }
}
