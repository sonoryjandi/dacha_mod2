package ru.meta_devs.amalysheva;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyStackTest {
    private MyStack<Integer> stack = new MyStack<Integer>(5);

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThat(stack.peek().equals(5));
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThat(stack.peek().equals(5));
        stack.pop();
        assertThat(stack.peek().equals(4));
    }

    @Test
    void peek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThat(stack.peek().equals(5));
    }

    @Test
    void isFull() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThat(stack.peek()).isEqualTo(5);
    }

    @Test
    void peekByIndex() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThat(stack.peekByIndex(1)).isEqualTo(2);
    }
}