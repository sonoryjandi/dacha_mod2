package ru.meta_devs.amalysheva;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<T> implements Queue<T> {
    private int maxSize;
    private T[] queueArray;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int maxSize)
    {
        this.maxSize = maxSize;
        queueArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        size = 0;
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
    public boolean add(T t) {
        if (isFull()){
            throw new IllegalStateException();
        }
        if (t == null){
            throw new NullPointerException();
        }
        if(rear == maxSize - 1){
            rear = -1;
        }
        queueArray[++rear] = t;
        size++;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        T temp = queueArray[front++];
        if (front == maxSize)
            front = 0;
        size--;
        return temp;
    }

    public boolean isFull(){
        return size == maxSize;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            return null;
        }
        return queueArray[front];
    }

    // region method
    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
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
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }
    // endregion
}
