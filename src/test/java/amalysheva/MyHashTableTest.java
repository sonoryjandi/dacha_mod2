package amalysheva;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class MyHashTableTest {
    private final MyHashTable<Integer> table = new MyHashTable<>(11);

    @Test
    void isTableEmpty() {
        assertThat(table.isEmpty()).isTrue();
        table.insert(789, 100);
        assertThat(table.isEmpty()).isFalse();
    }

    @Test
    void findElement() {
        table.insert(123, 100);
        table.insert(321, 45);
        table.insert(102, 78);
        assertThat(table.find(123)).isEqualTo(100);
    }

    @Test
    void insertElement() {
        table.insert(123, 100);
        table.insert(150, 150);
        assertThat(table.find(123)).isEqualTo(100);
        assertThat(table.find(150)).isEqualTo(150);
    }

    @Test
    void insertElementWithExistingKey(){
        table.insert(123, 100);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> table.insert(123, 100));
    }

    @Test
    void deleteElement(){
        table.insert(123, 100);
        table.delete(123);
        assertThat(table.isEmpty()).isTrue();
    }

    @Test
    void deleteElementThrowsNoSuchElementException(){
        table.insert(123, 100);
        table.delete(123);
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> table.delete(123));
    }
}