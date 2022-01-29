package ru.meta_devs.amalysheva;

public interface MyStackInterface<T> {

    /**
     * Метод размещает элемент на вершине стэка
     *
     * @param element добавляемый элемент
     */
    void push(T element);

    /**
     * Метод извлекает элемент с вершины стэка
     *
     * @return удалённый элемент
     */
    T pop();

    /**
     * Метод возвращает элемент на вершине стэка
     *
     * @return вершина стэка
     */
    T peek();

    /**
     * Метод возвращает true, если стэк пуст
     *
     * @return true, если стэк пуст
     */
    boolean isEmpty();

    /**
     * Метод возвращает true, если стэк полный
     *
     * @return true, если стэк полный
     */
    boolean isFull();

    /**
     * Метод печатает все элементы стэка
     */
    void print();

    /**
     * Метод возвращает элемент по индексу
     *
     * @param index искомого элемента
     *
     * @return искомый элемент
     */
    T peekByIndex(int index);
}
