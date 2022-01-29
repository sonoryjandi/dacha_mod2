package ru.meta_devs.amalysheva;

public class MainQ {
    public static void main(String[] args) {
        MyQueue<Integer> theQueue = new MyQueue<Integer>(5);
        theQueue.add(10);
        theQueue.add(20);
        theQueue.add(30);
        theQueue.add(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.add(50);
        theQueue.add(60);
        theQueue.add(70);
        theQueue.add(80);
        System.out.println(theQueue.peek());

        while (!theQueue.isEmpty()) {
            int n = theQueue.remove();
            System.out.print(n + " ");
        }
    }
}
