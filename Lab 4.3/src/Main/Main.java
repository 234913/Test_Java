package Main;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        java.util.Random objGenerator = new java.util.Random();
        int RArray[];
        RArray = new int[200];
        for (int count = 0; count < 200; count++){
            int randomNumber = objGenerator.nextInt(100);
            RArray[count] = randomNumber;
        }
        System.out.println("Enter nuber betwen 0 and 199:");
        Scanner Nuber = new Scanner(System.in);
        int N = Nuber.nextInt();
        try{
            System.out.println(RArray[N]);
        }
        catch(IndexOutOfBoundsException NotInRange){
            System.out.println("Not in range");
        }
    }
}
