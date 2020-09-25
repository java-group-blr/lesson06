import com.company.hw6.bo.Person;
import com.company.hw6.utils.ListSorter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListSorterTest {

    @Test
    public void sortIntegerFromMaxToMinTest() {
        List test = new ArrayList<Integer>();
        test.add(13);
        test.add(1);
        test.add(-4);
        test.add(55);
        test.add(5);

        List expected = new ArrayList<Integer>();
        expected.add(55);
        expected.add(13);
        expected.add(5);
        expected.add(1);
        expected.add(-4);

        ListSorter sorter = new ListSorter();
        List actual = sorter.sortIntegerFromMaxToMin(test);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPersonFromMaxToMinByComparableTest() {
        List test = new ArrayList<Person>();

        Person p1 = new Person("Max", "Fry");
        Person p2 = new Person("Andrey", "Petrov");
        Person p3 = new Person("Vitaly", "Ivanov");
        Person p4 = new Person("Fedor", "Ivanov");
        Person p5 = new Person("Ivan", "Sidorov");

        test.add(p1);
        test.add(p2);
        test.add(p3);
        test.add(p4);
        test.add(p5);

        List expected = new ArrayList<Integer>();
        expected.add(p1);
        expected.add(p4);
        expected.add(p3);
        expected.add(p2);
        expected.add(p5);

        ListSorter sorter = new ListSorter();
        List actual = sorter.sortPersonFromMaxToMinByComparable(test);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPersonFromMaxToMinByComparatorTest() {
        List test = new ArrayList<Person>();

        Person p1 = new Person("Max", "Fry");
        Person p2 = new Person("Andrey", "Petrov");
        Person p3 = new Person("Vitaly", "Ivanov");
        Person p4 = new Person("Fedor", "Ivanov");
        Person p5 = new Person("Ivan", "Sidorov");

        test.add(p1);
        test.add(p2);
        test.add(p3);
        test.add(p4);
        test.add(p5);

        List expected = new ArrayList<Integer>();
        expected.add(p1);
        expected.add(p4);
        expected.add(p3);
        expected.add(p2);
        expected.add(p5);

        ListSorter sorter = new ListSorter();
        List actual = sorter.sortPersonFromMaxToMinByComparator(test);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortObjectFromMaxToMinByComparableTest() {
        List test = new ArrayList<Person>();

        Person p1 = new Person("Max", "Fry");
        Person p2 = new Person("Andrey", "Petrov");
        Person p3 = new Person("Vitaly", "Ivanov");
        Person p4 = new Person("Fedor", "Ivanov");
        Person p5 = new Person("Ivan", "Sidorov");

        test.add(p1);
        test.add(p2);
        test.add(p3);
        test.add(p4);
        test.add(p5);

        List expected = new ArrayList<Integer>();
        expected.add(p1);
        expected.add(p4);
        expected.add(p3);
        expected.add(p2);
        expected.add(p5);

        ListSorter sorter = new ListSorter();
        List actual = sorter.sortObjectFromMaxToMinByComparable(test);

        Assert.assertEquals(expected, actual);
    }

}