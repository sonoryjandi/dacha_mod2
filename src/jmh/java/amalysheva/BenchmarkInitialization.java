package amalysheva;


import java.util.ArrayList;
import java.util.Collections;

public class BenchmarkInitialization {

    public ArrayList<Integer> listInitialization(int size) {
        ArrayList<Integer> randomIntegerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomIntegerList.add(i);
        }
        Collections.shuffle(randomIntegerList);
        return randomIntegerList;
    }

    public void fillTree(MyTree<Integer> tree, ArrayList<Integer> integerList, int size){
        for (int i = 0; i < size; i++) {
            tree.insert(i, integerList.get(i));
        }
    }

    public void clearTree(MyTree<Integer> tree, int counter){
        for (int i = 0; i < counter; i++) {
            tree.delete(i);
        }
    }
}