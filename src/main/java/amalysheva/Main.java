package amalysheva;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] unsortedArray = new int[10];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = r.nextInt(100);
        }
        System.out.println("Неотсортированный список");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        BubbleSorting sorter = new BubbleSorting(unsortedArray);
        int[] sortedArray = sorter.sorting();
        System.out.println("Отсортированный список");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}