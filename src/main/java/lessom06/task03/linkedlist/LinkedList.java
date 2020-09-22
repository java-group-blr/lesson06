package lessom06.task03.linkedlist;

public interface LinkedList<E> {
    boolean remove(Object o);

    void addLast(E e);

    void addFirst(E e);

    int size();

    E getIndex(int counter);
}