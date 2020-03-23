package main;

public class main {

    public static void main(String[] args)
    {
        int[] tablica = {4, 3, 6, 6, 2, 3, 9, 1, 2, 3};
        int znak = tablica[0];
        for(int i=0;i<10;i++)
            if(tablica[i]==1)
            {
                if(tablica[i+1]==2)
                {
                    if(tablica[i+2]==3)
                    {
                        System.out.println("Znaleziono: 1 2 3");
                    }
                }
            } else
            {
                System.out.println("Nie znaleziono: 1 2 3");
            }
    }
}
