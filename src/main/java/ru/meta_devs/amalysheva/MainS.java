package ru.meta_devs.amalysheva;

public class MainS {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<Integer>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.isFull());

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
        }
    }
}
