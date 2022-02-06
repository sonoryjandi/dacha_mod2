package amalysheva;

import java.util.Random;

public class SortingTest {

    public void addRandomElementsToArray(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
    }
}