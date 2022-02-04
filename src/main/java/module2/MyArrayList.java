package module2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class MyArrayList<R> implements List<R> {
    private R[] array;
    private int size;
    private final static int DEFAULT_CAPACITY = 10;

    // region getter/setter
    public R[] getArray() {
        return array;
    }

    public void setArray(R[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    // endregion

    public MyArrayList() {
        this.array = (R[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(R[] array) {
        this.array = array;
        this.size = array.length;
    }

    public MyArrayList(int length) {
        this.array = (R[]) new Object[length];
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newLength = (int) (array.length * 1.5);
            array = copyOf(array, newLength);
        }
    }

    private void validateIndex(int index) {
        if (index < 0 && index > (size - 1)) {
            throw new IndexOutOfBoundsException("There is no element with this index");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(R element) {
        ensureCapacity();
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object itemToRemove) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(itemToRemove)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, R element) {
        ensureCapacity();
        validateIndex(index);
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @Override
    public R remove(int index) {
        validateIndex(index);
        R deletedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedElement;
    }

    @Override
    public List<R> subList(int fromIndex, int toIndex) {
        R[] subArray = copyOfRange(array, fromIndex, toIndex);
        return new MyArrayList<>(subArray);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    private R[] copyOf(R[] array, int length) {
        R[] newArray = (R[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    private R[] copyOfRange(R[] array, int fromIndex, int toIndex){
        R[] newArray = (R[]) new Object[toIndex - fromIndex];
        int counter = fromIndex;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[counter];
            counter++;
        }
        return newArray;
    }

    // region methods
    @Override
    public Iterator<R> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends R> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends R> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public R get(int index) {
        return (R) array[index];
    }

    @Override
    public R set(int index, R element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<R> listIterator() {
        return null;
    }

    @Override
    public ListIterator<R> listIterator(int index) {
        return null;
    }

    @Override
    public void replaceAll(UnaryOperator<R> operator) {

    }

    @Override
    public void sort(Comparator<? super R> c) {

    }

    @Override
    public Spliterator<R> spliterator() {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super R> filter) {
        return false;
    }

    @Override
    public Stream<R> stream() {
        return null;
    }

    @Override
    public Stream<R> parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super R> action) {

    }
    // endregion
}
