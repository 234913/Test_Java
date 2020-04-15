package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner number = new Scanner(System.in);
        String x = number.next();
        try {
            int NumberInt = Integer.parseInt(x.trim());
            System.out.println("int NumberInt = " + NumberInt);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}
