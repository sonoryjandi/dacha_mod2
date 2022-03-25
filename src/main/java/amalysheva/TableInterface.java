package amalysheva;

public interface TableInterface<T> {
    void addColumn();

    void addLine();

    void deleteColumn();

    void deleteLine();

    void addElement(int id, T data);

    void deleteElement(int id);

}
