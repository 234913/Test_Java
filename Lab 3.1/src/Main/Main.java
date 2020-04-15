package Main;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        BubbleSort BBS = new BubbleSort();
        BucketSort BKS = new BucketSort();
       int x = 9;
       Scanner input = new Scanner(System.in);
       while(x!=0){
           System.out.println("Menu: ");
           System.out.println("1. Sort using Bubble Sorting");
           System.out.println("2. Sort using Bucket Sorting");
           System.out.println("0. Exit");
        x = input.nextInt();
       switch (x) {
           case 1:
               System.out.println("Using Bubble Sorting");
               BBS.sort(Random.RArray());
               break;
           case 2:
               System.out.println("Using Bucket Sorting");
               BKS.sort(Random.RArray());
               break;
           case 0:
               System.out.println("Quitting");
               break;
       }
       }
}
}
