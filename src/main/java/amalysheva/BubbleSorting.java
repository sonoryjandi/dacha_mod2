package amalysheva;

/**
 * Класс принимает массив и инкапсулирует его.
 * Содержит метод сортировки "пузырьковым" методом.
 * При создании экземпляра класса на аргумент принимается массив целочисленных значений.
 * Метод sorting() возвращает отсортированный "пузырьковым" методом массив целочисленных значений от меньшего к большему.
 */
public class BubbleSorting implements Sortable{
    private int[] array;

    public BubbleSorting(int[] array) {
        this.array = array;
    }

    /**
     * Метод сортирует целочисленные значения пузырьковым методом и возвращает отсортированный массив.
     * @return отсортированный массив целочисленных значений
     */
    public int[] sorting() {
        bubbleSort();
        return array;
    }

    /**
     * Метод сортирует целочисленные значения "пузырьковым" методом
     */
    private void bubbleSort() {
        int out, in;
        for (out = array.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    /**
     * Метод переставляет местами два ближайших элемента массива
     * @param one индекс первого элемента
     * @param two индекс второго элемента
     */
    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

}
