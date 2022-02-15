package amalysheva;

import java.util.NoSuchElementException;

/**
 * Интерфейс для структуры данных "двоичные деревья"
 * @param <T>
 */
public interface MyTreeInterface<T> {

    /**
     * Метод ищет узел дерева по заданному ключу
     * @param key заданный ключ
     * @return искомый элемент
     * @throws NoSuchElementException, если элемент с заданным ключом отсутствует или удалён
     */
    T find(int key);

    /**
     * Метод вставляет новый узел в дерево
     * @param id номер вставляемого элемента
     * @param data данные, хранящиеся в узле
     * @throws IllegalStateException, если элемент с заданным ключом уже существует
     */
    void insert(int id, T data);

    /**
     * Метод удаляет узел дерева исходя из его ключа
     * @param key ключ удаляемого элемента
     * @return true, если элемент успешно удалён
     * @throws NoSuchElementException, если удаляемый элемент не найден
     */
    boolean delete(int key);

    /**
     * Метод проверяет, пусто ли дерево
     * @return true, если дерево пустое
     */
    boolean isEmpty();

}
