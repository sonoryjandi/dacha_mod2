package amalysheva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashTableInitialisationBenchmark {
    protected static List<Integer> sourceList;

    protected void listInitialisation() {
        sourceList = new ArrayList<>(10000);
        for (int i = 0; i < 10000; i++) {
            sourceList.add(i);
        }
        Collections.shuffle(sourceList);
    }

    protected void fillTable(MyHashTable<Integer> table, int counter) {
        int value;
        for (int i = 0; i < counter; i++) {
            value = sourceList.get(i);
            table.insert(value, value);
        }
    }

    protected void clearTable(MyHashTable<Integer> table, int counter) {
        int value;
        for (int i = 0; i < counter; i++) {
            value = sourceList.get(i);
            table.delete(value);
        }
    }
}
