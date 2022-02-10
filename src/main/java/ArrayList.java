import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList implements List {

    private Object[] array;

    public ArrayList() {
        this.array = new Object[0];
    }

    @Override
    public boolean add(Object object) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = object;
        return true;
    }

    @Override
    public void remove(int index) {
        array[index] = null;
        for (int counter = index; counter < array.length; counter++){
            array[counter] = array[index + 1];
            array[index + 1] = null;
        }
        array = Arrays.copyOf(array, array.length - 1);
//        Object[] newArray = new Object[array.length - 1];
//        for (int i = 0; i < array.length; i++) {
//            array[index] = null;
//            if (array[i] = array[index]){
//                continue;
//            }
//            newArray[]
//            array[i] = array[i + 1];
//            array[i + 1] = null;
//        }
//        array = Arrays.copyOf(array, array.length - 1);
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public boolean contains(Object name) {
        for (Object object : array) {
            if (object.equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] subList(int fromIndex, int toIndex) {

        return new Object[0];
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
