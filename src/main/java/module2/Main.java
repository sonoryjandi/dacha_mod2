package module2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> array1 = new MyArrayList<>();
        array1.add("0");
        array1.add("1");
        array1.add("2");
        array1.add("3");
        array1.add("4");
        array1.print();

        MyArrayList<String> array2 = new MyArrayList<>(new String[] {"1", "2", "3"});
        array2.print();

        MyArrayList<Integer> array3 = new MyArrayList<>();
        array3.add(34);
        array3.print();
    }
}
