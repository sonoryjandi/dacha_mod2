import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ArrayListTest extends TestCase {

    @Test
    public void testSize() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        assertThat(arrayTest.getSize()).isEqualTo(0);
        arrayTest.add("lkjhgf");
        assertThat(arrayTest.getSize()).isEqualTo(1);
    }


    @Test
    public void testIsEmpty() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        assertTrue(arrayTest.isEmpty());
        arrayTest.add("Hell");
        assertFalse(arrayTest.isEmpty());
    }

    @Test
    public void testContains() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        arrayTest.add("1");
        arrayTest.add("2");
        arrayTest.add("3");
        assertTrue(arrayTest.contains("1"));
        assertFalse(arrayTest.contains("5"));
    }

    @Test
    public void testAdd() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        arrayTest.add("Hell");
        assertTrue(arrayTest.contains("Hell"));
        assertThat(arrayTest.get(0)).isEqualTo("Hell");
    }

    @Test
    public void testRemove() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        arrayTest.add("Hell");
        assertTrue(arrayTest.contains("Hell"));
        assertThat(arrayTest.get(0)).isEqualTo("Hell");
        assertThat(arrayTest.getSize()).isEqualTo(1);
        assertThat(arrayTest.remove(0)).isEqualTo("Hell");
        assertThat(arrayTest.getSize()).isEqualTo(0);
        assertThat(!arrayTest.contains("Hell"));
    }

    @Test
    public void testAddByIndex() {
        MyArrayList<String> arrayTest = new MyArrayList<>();
        assertThat(arrayTest.add("Klee"));
        arrayTest.add(0,"Kaeya");
        assertThat(arrayTest.get(0)).isEqualTo("Kaeya");
    }

    @Test
    public void testRemoveByIndex() {
        MyArrayList<String> arrayTest = new MyArrayList<>(new String[]{"Kaeya", "Klee", "Diona", "Xiao"});
        arrayTest.remove(1);
        assertThat(!arrayTest.contains("Klee"));
        assertThat(arrayTest.get(1)).isEqualTo("Diona");
    }

    @Test
    public void testSubList() {
        MyArrayList<String> arrayTest = new MyArrayList<>(new String[]{"Kaeya", "Klee", "Diona", "Xiao"});
        List <String> subList = arrayTest.subList(1, 2);
        assertThat(subList.get(0).equals("Klee"));
        assertThat(subList.size() == 1);
    }
}