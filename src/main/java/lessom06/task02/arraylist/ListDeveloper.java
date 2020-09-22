package lessom06.task02.arraylist;

public interface ListDeveloper<E> extends Iterable<E> {
    boolean add(E e);

    void delete(int index);

    E get(int index);

    int size();

    void update(int index, E e);
}