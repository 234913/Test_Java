package Main;

public class BubbleSort implements Sortable {

    @Override
    public int[] sort(int[] tab) {
        int temp;
        int change = 1;
         int number = 0;
        while (change > 0) {
            change = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    change++;
                    number++;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted No: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Number of comparisons: " + number);
        return tab;
    }
}
