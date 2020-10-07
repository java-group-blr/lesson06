package com.javablr;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void integersSort(List<Integer> list) {
        for (int i = list.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j +1 )) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static <T extends  Comparable<T>> void objectsSort(List<T> list, Comparator<? super T> c) {
        System.out.println(c.toString());
        for (int i = list.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j +1 )) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
