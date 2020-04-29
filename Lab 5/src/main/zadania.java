package main;

import java.util.Scanner;

public class zadania {
    public zadania() {
    }
    private int temperatura1;
    private int temperatura2;
    private int[] tablica;
    private int dlugosc;
    private int[] tablica2;
    private String znak;
    private int[] temp;

    public boolean temp(int temperatura1, int temperatura2)
    {
        if ((temperatura1<100) || (temperatura2<100))
        {
            System.out.println("Przynajmniej jedna z temp jest mniejsza od 100");
            return true;
        }
        else
            return false;
    }

    public boolean tabl(int[] tablica)
    {
        boolean x = false;
        for(int i=0;i<tablica.length;i++)
            if(tablica[i]==1)
            {
                if(tablica[i+1]==2)
                {
                    if(tablica[i+2]==3)
                    {
                        System.out.println("Znaleziono: 1 2 3");
                        x = true;
                        break;
                    }
                }
            } else
            {
                System.out.println("Nie znaleziono: 1 2 3");
                x =false;
            }
        if (x)
            return true;
        else
            return false;
    }
    public String znak(String znak)
    {
        dlugosc = znak.length();
        System.out.println(znak.substring(0, dlugosc/2));
        znak = znak.substring(0, dlugosc/2);
        return znak;
    }
    public static int[] odwr(int[] tablica2)
    {
        int[] temp = new int [tablica2.length];
        for (int i=0;i<tablica2.length;i++){
            temp[i]=tablica2[tablica2.length-(1+i)];
        }
        for (int i=0;i<tablica2.length;i++){
            tablica2[i] = temp[i];
        }
        for (int i=0;i<tablica2.length;i++){
            System.out.println(tablica2[i]);
        }
            return tablica2;
    }

    public int[] getTemp() {
        return temp;
    }

    public int getTemperatura1() {
        return temperatura1;
    }

    public void setTemperatura1(int temperatura1) {
        this.temperatura1 = temperatura1;
    }

    public int getTemperatura2() {
        return temperatura2;
    }

    public void setTemperatura2(int temperatura2) {
        this.temperatura2 = temperatura2;
    }

    public int[] getTablica() {
        return tablica;
    }

    public void setTablica(int[] tablica) {
        this.tablica = tablica;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int[] getTablica2() {
        return tablica2;
    }

    public void setTablica2(int[] tablica2) {
        this.tablica2 = tablica2;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }
}
