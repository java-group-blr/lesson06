package com.company.hw6.utils;

import com.company.hw6.bo.Person;

import java.util.Collections;
import java.util.List;

public class ListSorter {

    public List<Integer> sortIntegerFromMaxToMin(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j + 1) > list.get(j)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    public List<Person> sortPersonFromMaxToMinByComparable(List<Person> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j + 1).compareTo(list.get(j)) < 0) {
                    Person temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    public List<Person> sortPersonFromMaxToMinByComparator(List<Person> list) {
        Collections.sort(list, new PersonComparator());
        return list;
    }

    public <T extends Comparable<T>> List<T> sortObjectFromMaxToMinByComparable(List<T> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j + 1).compareTo(list.get(j)) < 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
