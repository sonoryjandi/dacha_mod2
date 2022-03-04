package amalysheva;

public interface MyHashMap<T> { //extends HashMap, impl Map

    boolean isEmpty();

    T find(int key);

    void insert(int key, T data);

    DataItem<T> delete(int key);
}