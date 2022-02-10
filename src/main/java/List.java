public interface List {
    boolean add(Object name);

    void remove(int index);

    int size();

    boolean isEmpty();

    boolean contains(Object name);

    Object[] subList(int fromIndex, int toIndex);

}