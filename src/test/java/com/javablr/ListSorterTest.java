package com.javablr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListSorterTest {

    final static StudentTest STUDENT_1 = new StudentTest("Bob", 22);
    final static StudentTest STUDENT_2 = new StudentTest("Tom", 18);
    final static StudentTest STUDENT_3 = new StudentTest("Rob", 19);
    final static StudentTest STUDENT_4 = new StudentTest("Jef", 20);
    final static StudentTest STUDENT_5 = new StudentTest("Mike", 25);

    List<StudentTest> studentList;

    @Before
    public void init() {
        studentList = new ArrayList <>();
        studentList.add(STUDENT_1);
        studentList.add(STUDENT_2);
        studentList.add(STUDENT_3);
        studentList.add(STUDENT_4);
        studentList.add(STUDENT_5);
    }

    @Test
    public void testStudentSortByName() {
        ListSorter.objectsSort(studentList, StudentTest.Comparators.NAME);

        ArrayList<StudentTest> expectedStudentList = new ArrayList<>();

        expectedStudentList.add(STUDENT_1);
        expectedStudentList.add(STUDENT_4);
        expectedStudentList.add(STUDENT_5);
        expectedStudentList.add(STUDENT_3);
        expectedStudentList.add(STUDENT_2);

        Assert.assertEquals(expectedStudentList, studentList);
    }


    @Test
    public void testIntSort() {
        List <Integer> integersList = new ArrayList <>();
        integersList.add(STUDENT_1.age);
        integersList.add(STUDENT_2.age);
        integersList.add(STUDENT_3.age);
        integersList.add(STUDENT_4.age);
        integersList.add(STUDENT_5.age);

        ListSorter.integersSort(integersList);

        List <Integer> expectedIntegersList = new ArrayList <>();
        expectedIntegersList.add(STUDENT_2.age);
        expectedIntegersList.add(STUDENT_3.age);
        expectedIntegersList.add(STUDENT_4.age);
        expectedIntegersList.add(STUDENT_1.age);
        expectedIntegersList.add(STUDENT_5.age);

        Assert.assertEquals(expectedIntegersList, integersList);
    }
}
