package amalysheva;

/**
 * Класс принимает массив и инкапсулирует его.
 * Содержит метод сортировки методом выбора.
 * При создании экземпляра класса на аргумент принимается массив целочисленных значений.
 * Метод sorting() возвращает отсортированный методом выбора массив целочисленных значений от меньшего к большему.
 */
public class SelectionSorting implements Sortable {
    private int[] array;

    public SelectionSorting(int[] array) {
        this.array = array;
    }

    /**
     * Метод сортирует целочисленные значения методом выбора и возвращает отсортированный массив.
     * @return отсортированный массив целочисленных значений
     */
    @Override
    public int[] sorting() {
        selectionSort();
        return array;
    }

    /**
     * Метод сортирует целочисленные значения методом выбора
     */
    private void selectionSort() {
        int out, in, min;

        for (out = 0; out < array.length - 1; out++) {
            min = out;
            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    /**
     * Метод переставляет местами два ближайших элемента массива
     * @param one индекс первого элемента
     * @param two индекс второго элемента
     */
    private void swap (int one, int two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}

