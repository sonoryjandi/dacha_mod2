package amalysheva;

import java.util.NoSuchElementException;

public class MyTree<T> implements MyTreeInterface<T> {
    private Node<T> root;
    private boolean isLeftChild = true;

    public Node<T> getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public T find(int key) {
        if (isEmpty()) {
            throw new NoSuchElementException("Дерево пустое");
        }
        Node<T> current = root;
        if (current == null) {
            throw new NoSuchElementException ("Такого элемента не существует или он был удалён");
        }
        while (current.id != key) {
            if (key < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return current.data;
    }

    @Override
    public void insert(int key, T data) {
        Node<T> newNode = new Node<>(key, data);
        if (isEmpty()) {
            root = newNode;
            return;
        }
        Node<T> current = root;
        Node<T> parent;
        while (true) {
            parent = current;
            if(current.id == key){
                throw new IllegalStateException("Такой элемент уже есть");
            }
            if (key < current.id) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
                continue;
            }
            current = current.rightChild;
            if (current == null) {
                parent.rightChild = newNode;
                return;
            }
        }
    }

    @Override
    public boolean delete(int key) {
        if (isEmpty()) {
            throw new NoSuchElementException("Дерево пустое");
        }
        Node<T> current = root;
        Node<T> parent = root;

        while (current.id != key) {
            if (current == null) //
                throw new NoSuchElementException("Удаляемый элемент не был найден");
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = current.leftChild;
                continue;
            }
            isLeftChild = false;
            current = current.rightChild;
        }

        if (isThisLeaf(current)) {
            swap(current, null, parent);
        } else if (current.rightChild == null) {
            swap(current, current.leftChild, parent);
        } else if (current.leftChild == null) {
            swap(current, current.rightChild, parent);
        } else {
            Node<T> successor = getSuccessor(current);
            swap(current, successor, parent);
            successor.leftChild = current.leftChild;
        } return true;
    }

    private void swap(Node<T> current, Node<T> child, Node<T> parent) {
        if (current == root) {
            root = child;
            return;
        }
        if (isLeftChild) {
            parent.leftChild = child;
            return;
        }
        parent.rightChild = child;
    }

    private boolean isThisLeaf(Node<T> current) {
        return current.leftChild == null && current.rightChild == null;
    }

    private Node<T> getSuccessor(Node<T> delNode) {
        Node<T> successorParent = delNode;
        Node<T> successor = delNode;
        Node<T> current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    private void preOrder(Node<T> localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node<T> localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node<T> localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.data + " ");
        }
    }
}
