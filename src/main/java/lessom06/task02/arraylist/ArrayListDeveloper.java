package lessom06.task02.arraylist;

import java.util.Iterator;

public class ArrayListDeveloper<E> implements ListDeveloper<E> {
    private E[] values;

    public ArrayListDeveloper() {
        values = (E[]) new Object[0];
    }
    @Override
    public boolean add(E e) {
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, values, 0, temp.length);
        values[values.length - 1] = e;
        return true;
    }

    @Override
    public void delete(int index) {
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, values, 0, index);
        int afterIndex = temp.length - index-1;
        System.arraycopy(temp, index+1, values, index, afterIndex);
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;

    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}