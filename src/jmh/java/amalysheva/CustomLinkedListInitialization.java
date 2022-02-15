package amalysheva;

public class CustomLinkedListInitialization {

    public void fillFirst(DoublyLinkedList<Integer> linkedList, int counter) {
        for (int i = 0; i < counter; i++) {
            linkedList.addFirst(i);
        }
    }

    public void fillLast(DoublyLinkedList<Integer> linkedList, int counter) {
        for (int i = 0; i < counter; i++) {
            linkedList.addLast(i);
        }
    }

    public void fillAfter(DoublyLinkedList<Integer> linkedList, int counter) {
        linkedList.addFirst(0);
        for (int i = 1; i < counter; i++) {
            linkedList.insertAfter(i - 1, i);
        }
    }

    public void clearFirst(DoublyLinkedList<Integer> linkedList, int counter) {
        for (int i = 0; i < counter; i++) {
            linkedList.removeFirst();
        }
    }

    public void clearLast(DoublyLinkedList<Integer> linkedList, int counter) {
        for (int i = 0; i < counter; i++) {
            linkedList.removeLast();
        }
    }

    public void clearByKey(DoublyLinkedList<Integer> linkedList, int counter) {
        int counterKey = counter;
        for (int i = 0; i < counter; i++) {
            linkedList.deleteKey(counterKey);
            counterKey--;
        }
    }
}