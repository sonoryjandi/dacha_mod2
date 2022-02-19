package amalysheva;

import java.util.Deque;

public interface DoublyLinkedList<T> extends Deque<T> {

    /**
     * Вставляет в список заданный элемент после элемента с указанным ключом.
     *
     * @param key - ключ элемента, после которого происходит вставка
     * @param data - данные для вставки
     * @return true, если элемент вставлен успешно
     */
    boolean insertAfter(T key, T data);

    /**
     * Удаляет элемент с указанным ключом.
     *
     * @param key - ключ удаляемого элемента
     * @return - удалённый элемент
     */
    T deleteKey(T key);
}