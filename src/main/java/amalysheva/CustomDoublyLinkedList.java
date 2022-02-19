package amalysheva;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomDoublyLinkedList<T> implements DoublyLinkedList<T> {
    private Link<T> first;
    private Link<T> last;

    protected class Link<T>{
        public T data;
        public Link<T> next;
        public Link<T> previous;

        public Link(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void addFirst(T data) {
        Link<T> newLink = new Link<>(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    @Override
    public void addLast(T data) {
        Link<T> newLink = new Link<>(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    @Override
    public T removeFirst() {
        T temp = first.data;
        if (isEmpty()) {
            throw new NoSuchElementException("Список пуст");
        }
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    @Override
    public T removeLast() {
        T temp = last.data;
        if (isEmpty()) {
            throw new NoSuchElementException("Список пуст");
        }
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    @Override
    public boolean insertAfter(T key, T data) {
        Link<T> current = first;
        while (!current.data.equals(key)) {
            current = current.next;
            if (current == null) {
                throw new NoSuchElementException("Элемента с ключом " + key + " нет");
            }
        }
        Link<T> newLink = new Link<>(data);
        if (current.equals(last)) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    @Override
    public T deleteKey(T key) {
        Link<T> current = first;
        if (isEmpty()) {
            return null;
        }
        while (!current.data.equals(key)) {
            current = current.next;
            if (current == null) {
                throw new NoSuchElementException("Элемента с ключом " + key + " нет");
            }
        }
        if (current.equals(first)) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current.equals(last)) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current.data;
    }

    // region getter
    @Override
    public T getFirst() {
        return first.data;
    }

    @Override
    public T getLast() {
        return last.data;
    }
    // endregion

    // region other methods
    @Override
    public boolean offerFirst(T t) {
        return false;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public void push(T t) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
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

    // endregion
}
