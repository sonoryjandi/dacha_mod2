package module2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class ArrayListTest {

    @Test
    public void size() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        assertThat(arrayTest.getSize()).isEqualTo(0);
        arrayTest.add("word");
        assertThat(arrayTest.getSize()).isEqualTo(1);
    }


    @Test
    public void ifArrayIsEmpty() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        Assertions.assertTrue(arrayTest.isEmpty());
        arrayTest.add("Hell");
        Assertions.assertFalse(arrayTest.isEmpty());
    }

    @Test
    public void arrayContainsElement() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        arrayTest.add("1");
        arrayTest.add("2");
        arrayTest.add("3");
        Assertions.assertTrue(arrayTest.contains("1"));
        Assertions.assertFalse(arrayTest.contains("5"));
    }

    @Test
    public void add() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        arrayTest.add("Hell");
        Assertions.assertTrue(arrayTest.contains("Hell"));
        assertThat(arrayTest.get(0)).isEqualTo("Hell");
    }

    @Test
    public void addIfArrayIsFull() {
        MyArrayList<String> arrayTest = new MyArrayList<>(2);
        arrayTest.add("1");
        arrayTest.add("2");
        arrayTest.add("3");
        arrayTest.add("4");
        arrayTest.add("5");
        assertThat(arrayTest.size()).isEqualTo(5);
    }

    @Test
    public void remove() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        arrayTest.add("Hell");
        Assertions.assertTrue(arrayTest.contains("Hell"));
        assertThat(arrayTest.get(0)).isEqualTo("Hell");
        assertThat(arrayTest.getSize()).isEqualTo(1);
        assertThat(arrayTest.remove(0)).isEqualTo("Hell");
        assertThat(arrayTest.getSize()).isEqualTo(0);
        assertThat(!arrayTest.contains("Hell"));
    }

    @Test
    public void removeIfThereIsNoSuchElement(){
        MyArrayList<String> arrayTest = new MyArrayList<>(3);
        arrayTest.add("one");
        arrayTest.add("two");
        arrayTest.add("three");
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() ->
                arrayTest.remove(5));
    }

    @Test
    public void addByIndex() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        assertThat(arrayTest.add("Klee"));
        arrayTest.add(0,"Kaeya");
        assertThat(arrayTest.get(0)).isEqualTo("Kaeya");
    }

    @Test
    public void removeByIndex() {
        MyArrayList<String> arrayTest = new MyArrayList<>(new String[]{"Kaeya", "Klee", "Diona", "Xiao"});
        arrayTest.remove(1);
        assertThat(!arrayTest.contains("Klee"));
        assertThat(arrayTest.get(1)).isEqualTo("Diona");
    }

    @Test
    public void subList() {
        MyArrayList<String> arrayTest = new MyArrayList<>(new String[]{"Kaeya", "Klee", "Diona", "Xiao"});
        List <String> subList = arrayTest.subList(1, 2);
        assertThat(subList.get(0).equals("Klee"));
        assertThat(subList.size() == 1);
    }
}