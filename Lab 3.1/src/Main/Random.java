package Main;

public class Random {

    public static int[] RArray() {
        java.util.Random objGenerator = new java.util.Random();
        int RArray[];
        RArray = new int[200];
        System.out.println("Random No: ");

        for (int count = 0; count < 200; count++){
            int randomNumber = objGenerator.nextInt(100);
            System.out.print(randomNumber + " ");
            RArray[count] = randomNumber;
        }
        return RArray;
    }
}