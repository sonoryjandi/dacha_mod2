package amalysheva;

/**
 * Класс принимает массив и инкапсулирует его.
 * Содержит метод сортировки методом вставки.
 * При создании экземпляра класса на аргумент принимается массив целочисленных значений.
 * Метод sorting() возвращает отсортированный методом вставки массив целочисленных значений от меньшего к большему.
 */
public class InsertionSorting implements Sortable{
    private int[] array;

    public InsertionSorting(int[] array) {
        this.array = array;
    }

    /**
     * Метод сортирует целочисленные значения методом вставки и возвращает отсортированный массив.
     * @return отсортированный массив целочисленных значений
     */
    @Override
    public int[] sorting() {
        insertionSort();
        return array;
    }

    /**
     * Метод сортирует целочисленные значения методом вставки
     */
    private void insertionSort(){
        int in, out;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }
}
