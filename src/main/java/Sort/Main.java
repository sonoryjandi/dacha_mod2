package Sort;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arrayBub = new ArrayBub(maxSize);
        arrayBub.insert(77);
        arrayBub.insert(99);
        arrayBub.insert(44);
        arrayBub.insert(55);
        arrayBub.insert(22);
        arrayBub.insert(88);
        arrayBub.insert(11);
        arrayBub.insert(00);
        arrayBub.insert(66);
        arrayBub.insert(33);

        System.out.println("Без сортировки");
        arrayBub.display();
        arrayBub.bubbleSort();
        System.out.println("С сортировкой");
        arrayBub.display();
    }
}
