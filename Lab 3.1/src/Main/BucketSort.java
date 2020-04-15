package Main;

import java.util.ArrayList;
import java.util.List;

public class BucketSort implements Sortable {

    @Override
    public int[] sort(int[] tab) {
        int max = 0;
        int numofbucket = 10;
        List<List<Integer>> bucket = new ArrayList<>(numofbucket);
        for (int i = 0; i < numofbucket; i++){
            bucket.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max){
                max = tab[i];
        }
    }
        int divider = ((max+1)/numofbucket);
        int j;

        for (int i = 0; i < tab.length; i++) {
            j = (tab[i]/divider);
            bucket.get(j).add(tab[i]);
            }

        int temp;
        int number = 0;
        int change = 1;
        for(int i = 0; i < numofbucket; i++){
            change = 1;
            while (change > 0) {
                change = 0;

                for (j = 0; j < bucket.get(i).size()-1; j++) {

                    if (bucket.get(i).get(j) > bucket.get(i).get(j + 1)) {
                        temp = bucket.get(i).get(j + 1);
                        bucket.get(i).set(j+1,bucket.get(i).get(j));
                        bucket.get(i).set(j,temp);
                        change++;
                        number++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Sorted No: ");
        int x = 0;
        for(int i = 0; i < numofbucket; i++) {
                for (j = 0; j < bucket.get(i).size(); j++) {
                    System.out.print(bucket.get(i).get(j) + " ");
                    tab[x] = bucket.get(i).get(j);
                    }
                }
        System.out.println();
        System.out.println("Number of comparisons: " + number);
        return tab;
    }
}