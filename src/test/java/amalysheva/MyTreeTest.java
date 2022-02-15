package amalysheva;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;

class MyTreeTest {
    private MyTree<String> binaryTree = new MyTree<>();

    @Test
    void isEmpty() {
        assertThat(binaryTree.isEmpty()).isTrue();
        binaryTree.insert(1, "One");
        assertThat(binaryTree.isEmpty()).isFalse();
    }

    @Test
    void insert() {
        binaryTree.insert(56, "One");
        binaryTree.insert(10, "Two");
        binaryTree.insert(50, "Three");
        binaryTree.insert(89, "Four");
        assertThat(binaryTree.isEmpty()).isFalse();
    }

    @Test
    void insertExistingNodeException(){
        insert();
        assertThatExceptionOfType(IllegalStateException.class).isThrownBy(() -> {
            binaryTree.insert(89, "Whatever");
        });
    }

    @Test
    void findNode() {
        insert();
        assertThat(binaryTree.find(50)).isEqualTo("Three");
    }

    @Test
    void findEmptyTreeException() {
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> {
            binaryTree.find(56);
        });
    }

    @Test
    void findingNonExistingNodeException(){
        insert();
        binaryTree.delete(10);
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
            binaryTree.find(10);
        });
    }


    @Test
    void delete() {
        insert();
        binaryTree.delete(56);
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
            binaryTree.find(56);
        });
    }

    @Test
    void deletingNonExistingNodeException(){
        insert();
        binaryTree.delete(56);
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
            binaryTree.delete(56);
        });
    }
}