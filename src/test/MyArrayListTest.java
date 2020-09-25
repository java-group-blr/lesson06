import com.company.hw6.MyArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

    private MyArrayList list;

    @Before
    public void initialize() {
        list = new MyArrayList<Integer>();
        list.add(4);
        list.add(54);
        list.add(13);
        list.add(-5);
        list.add(7);
    }

    @Test
    public void getTest() {
        Assert.assertEquals(list.get(0), 4);
    }

    @Test
    public void addTest() {
        list.add(9);
        Assert.assertEquals(list.get(5), 9);
    }

    @Test
    public void removeTest() {
        list.remove(0);
        MyArrayList expected = new MyArrayList<Integer>();
        expected.add(54);
        expected.add(13);
        expected.add(-5);
        expected.add(7);
        Assert.assertEquals(expected, list);
    }
}
