import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> array1 = new MyArrayList();
        array1.add("0");
        array1.add("1");
        array1.add("2");
        array1.add("3");
        array1.add("4");
//        array1.remove(3);
        array1.remove("1");
        array1.remove("0");
        array1.remove("2");
        array1.add("8");
        ((MyArrayList) array1).print();

        List <String> array2 = new MyArrayList<>(new Object[] {"1", "2", "3"});
        ((MyArrayList<String>) array2).print();

        MyArrayList<Integer> array3 = new MyArrayList<>();
        array3.add(34);
        array3.print();
    }
}
