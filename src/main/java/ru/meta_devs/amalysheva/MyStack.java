package ru.meta_devs.amalysheva;

public class MyStack<T> implements MyStackInterface {
    private int size;
    private T[] stackArray;
    private int top;

    public MyStack (int size) {
        this.size = size;
        stackArray = (T[]) new Object[size];
        top = -1;
    }

    public void push (Object element) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        stackArray[++top] = (T) element;
    }

    public T pop() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }
        return stackArray[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public T peekByIndex(int index){
        return stackArray[index];
    }

    public void print() {
        for (int i = 0; i < stackArray.length; i++) {
            System.out.println(stackArray[i]);
        }
    }
}
