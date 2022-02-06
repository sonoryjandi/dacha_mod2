package amalysheva;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InsertionSortingTest extends SortingTest {
    protected final int SIZE_OF_ARRAYS = 100;

    @Test
    void insertionSelection() {
        int[] array1 = new int[SIZE_OF_ARRAYS];
        addRandomElementsToArray(array1);
        int[] array2 = Arrays.copyOf(array1, SIZE_OF_ARRAYS);

        InsertionSorting sorter = new InsertionSorting(array1);
        int[] sortedArray1 = sorter.sorting();
        Arrays.sort(array2);

        assertThat(sortedArray1).isEqualTo(array2);
    }
}