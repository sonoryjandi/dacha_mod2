package amalysheva;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class DoublyLinkedListTest {
    CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();

    @Test
    void listIsEmpty() {
        assertThat(linkedList.isEmpty()).isTrue();
        linkedList.addFirst(1);
        assertThat(linkedList.isEmpty()).isFalse();
    }

    @Test
    void addingElementFirst() {
        assertThat(linkedList.isEmpty()).isTrue();
        linkedList.addFirst(1);
        assertThat(linkedList.isEmpty()).isFalse();
        assertThat(linkedList.getFirst()).isEqualTo(1);
    }

    @Test
    void addingElementLast() {
        addingElementFirst();
        linkedList.addLast(6);
        assertThat(linkedList.getLast()).isEqualTo(6);
    }

    @Test
    void removingElementFirst() {
        addingElementFirst();
        linkedList.removeFirst();
        assertThat(linkedList.isEmpty()).isTrue();
    }

    @Test
    void removingElementLast() {
        addingElementFirst();
        linkedList.addLast(7);
        linkedList.removeLast();
        assertThat(linkedList.getLast()).isEqualTo(1);
    }

    @Test
    void insertAfter() {
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.insertAfter(2, 10);
        assertThat(linkedList.getLast()).isEqualTo(10);
    }

    @Test
    void deleteKey() {
        insertAfter();
        linkedList.insertAfter(10, 20);
        assertThat(linkedList.getLast()).isEqualTo(20);
        linkedList.deleteKey(20);
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> {
            linkedList.deleteKey(20);
        });
    }
}