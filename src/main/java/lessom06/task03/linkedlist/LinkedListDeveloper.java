package lessom06.task03.linkedlist;

import java.util.Iterator;

/*
1.Linkedlist В нутри нету массива.
2.Каждая ячейка листа это объект класса.
3.Разбросаны по памяти но имеют ссылки на следующий и на предыдущий объект.
4.То есть соединены в связную структуру .
5. Списки бывают замкнутые и не замкнутые
6. Долго находит нужные элементы

Я создал с не связным списком первый и последний элемент не имеют ссылку друг на друга.
 */
public class LinkedListDeveloper<E> implements LinkedList<E>, Iterable<E> {
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedListDeveloper() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null, null, lstNode);
    }

    private class Node<E> {
        private E element;
        private Node<E> nextElement;
        private Node<E> privElement;

        private Node(E element, Node<E> privElement, Node<E> nextElement) {
            this.element = element;
            this.nextElement = nextElement;
            this.privElement = privElement;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrivElement() {
            return privElement;
        }

        public void setPrivElement(Node<E> privElement) {
            this.privElement = privElement;
        }
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = fstNode; x != null; x = x.nextElement) {
                if (x.element == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = fstNode; x != null; x = x.nextElement) {
                if (o.equals(x.element)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.element;
        final Node<E> next = x.nextElement;
        final Node<E> prev = x.privElement;

        if (prev == null) {
            fstNode = next;
        } else {
            prev.nextElement = next;
            x.privElement = null;
        }

        if (next == null) {
            lstNode = prev;
        } else {
            next.privElement = prev;
            x.nextElement = null;
        }

        x.element = null;
        size--;
        return element;
    }

    @Override
    public void addLast(E e) {
        Node<E> previous = lstNode;
        previous.setElement(e);
        lstNode = new Node<E>(null, previous, null);
        previous.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = fstNode;
        next.setElement(e);
        fstNode = new Node<E>(null, null, next);
        next.setPrivElement(fstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getIndex(int counter) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getElement();
    }

    private Node<E> getNextElement(Node<E> nextElement) {
        return nextElement.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getIndex(counter++);
            }
        };
    }
}