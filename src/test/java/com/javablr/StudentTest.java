package com.javablr;

import java.util.Comparator;

public class StudentTest implements Comparable <StudentTest>{
    String name;
    int age;

    public StudentTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }


    @Override
    public int compareTo(StudentTest o) {
        return Comparators.NAME.compare(this, o);
    }

    public static class Comparators {

        public static Comparator<StudentTest> NAME = Comparator.comparing(o -> o.name);
        public static Comparator<StudentTest> AGE = Comparator.comparingInt(o -> o.age);
    }
}
