package ru.meta_devs.amalysheva;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyQueueTest {
    private MyQueue<Integer> qwe = new MyQueue<Integer>(5);

    @Test
    void numberOfElementsInQueue() {
        assertThat(qwe.size()).isEqualTo(0);
        qwe.add(0);
        assertThat(qwe.size()).isEqualTo(1);
    }

    @Test
    void ifQueueSizeIsEmpty() {
        assertThat(qwe.size()).isEqualTo(0);
    }

    @Test
    void add() {
        qwe.add(1);
        assertEquals(1, qwe.size());
        assertThat(qwe.size()).isEqualTo(1);
    }

    @Test
    void addingExtraElementShouldThrowIllegalStateException() {
        for (int i = 0; i < 5; i++) {
            qwe.add(i);
        }
        assertThatExceptionOfType(IllegalStateException.class).isThrownBy(() -> {
            qwe.add(10);
        });
    }

    @Test
    void remove() {
        qwe.add(1);
        qwe.remove();
        assertThat(qwe.size()).isEqualTo(0);
    }

    @Test
    void removeIfQueueIsEmpty() {
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> {
            qwe.remove();
        });
    }

    @Test
    void ifQueueSizeIsFull() {
        qwe.add(1);
        qwe.add(2);
        qwe.add(3);
        qwe.add(4);
        qwe.add(5);
        assertTrue(qwe.isFull());
    }

    @Test
    void peek() {
        qwe.add(1);
        qwe.add(2);
        qwe.add(3);
        qwe.add(4);
        qwe.add(5);
        assertThat(qwe.peek()).isEqualTo(1);
    }

    @Test
    void peekReturnNull(){
        assertThat(qwe.peek()).isNull();
    }
}