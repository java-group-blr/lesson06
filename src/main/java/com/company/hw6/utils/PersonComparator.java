package com.company.hw6.utils;

import com.company.hw6.bo.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        if (o1 == null && o2 == null) {
            return 0;
        }

        if (o1 == null) {
            return -1;
        }

        if (o2 == null) {
            return 1;
        }

        int value = o1.getLastName().compareTo(o2.getLastName());

        if (value != 0) {
            return value;
        }

        value = o1.getFirstName().compareTo(o2.getFirstName());
        return value;
    }
}