package main;

import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {
        { Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę wierszy");
            int n = scan.nextInt();
            //String gwiazdki;
            for(int i=0; i<=n; i++)
            {

                for(int j=0; j<i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
