package amalysheva;

import java.util.NoSuchElementException;

public class MyHashTable<T> implements MyHashMap<T> {
    private DataItem<T>[] hashArray;
    private int size;
    private DataItem<T> nonItem;

    public MyHashTable(int length) {
        hashArray = new DataItem[calculateLength(length)];
        size = 0;
        nonItem = new DataItem<>(-1, null);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T find(int key) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int hashValue = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKey() == key) {
                return hashArray[hashValue].getData();
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void insert(int key, T data) {
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        if (hashArray.length == size) {
            throw new HashTableIsFullException("Добавление невозможно, таблица заполнена");
        }
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            if (hashArray[hashVal].getKey() == key) {
                throw new IllegalArgumentException();
            }
            hashVal += stepSize;
            hashVal %= hashArray.length;
        }
        hashArray[hashVal] = new DataItem<>(key, data);
        size++;
    }

    @Override
    public DataItem<T> delete(int key) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DataItem<T> temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                size--;
                return temp;
            }
            hashVal += stepSize;
            hashVal %= hashArray.length;
        }
        throw new NoSuchElementException("Удаляемого элемента нет");
    }

    private int hashFunction1(int key) {
        return key % hashArray.length;
    }

    private int hashFunction2(int key) {
        return 5 - key % 5;
    }

    private int calculateLength(int userInput) {
        for (int i = userInput; true; i++) {
            if(isPrime(i)){
                return i;
            }
        }
    }

    private boolean isPrime(int length) {
        for (int i = 2; i*i <= length; i++) {
            if(length % i == 0){
                return false;
            }
        }
        return true;
    }
}
