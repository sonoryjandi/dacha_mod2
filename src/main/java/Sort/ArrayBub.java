package Sort;

public class ArrayBub {
    private int[] array;
    private int size;

    public ArrayBub(int length) {
        this.array = new int[length];
        this.size = 0;
    }

    public void insert(int value) {
        array[size] = value;
        size++;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void bubbleSort(){
        int out, in;
        for (out = size - 1; out > 1; out--){
            for (in = 0; in < out; in++){
                if (array[in] > array[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap (int one, int two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
