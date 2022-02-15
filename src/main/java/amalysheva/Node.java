package amalysheva;

public class Node<T> {
    int id;
    T data;
    Node<T> leftChild;
    Node<T> rightChild;

    public Node(int id, T data) {
        this.id = id;
        this.data = data;
    }
}
