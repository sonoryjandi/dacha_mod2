package amalysheva;

public class DataItem<T> {
    private int key;
    private T data;

    public DataItem(int key, T data) {
        this.key = key;
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public T getData() {
        return data;
    }

}
