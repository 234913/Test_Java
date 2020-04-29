package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void zad1() {
        zadania Zadania = new zadania();
        boolean i = true;
        assertEquals(i,Zadania.temp(125,52),"nie działa");
    }
    @Test
    void zad2(){
        zadania Zadania = new zadania();
        boolean i = true;
        int[] x = {3,4,5,8,1,2,3,6,8,7};
        assertEquals(i,Zadania.tabl(x),"nie działa");
    }
    @Test
    void zad3(){
        zadania Zadania = new zadania();
        String a = "Czy d";
        assertEquals(a,Zadania.znak("Czy działa"),"nie działa");
    }
    @Test
    void zad4(){
        zadania Zadania = new zadania();
        int[] i = {4,3,2,1};
        int[] x = {1,2,3,4};
        assertArrayEquals(i,Zadania.odwr(x),"nie działa");
}
}