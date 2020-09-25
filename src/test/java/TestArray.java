
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

public class TestArray {

    @Test
    public void testArrSort() {
        ArrayList<Integer> arrayListl = new ArrayList<>();
        arrayListl.add(0);
       arrayListl.add(1);
       arrayListl.add(2);
        ArrayList<Integer> expected = new ArrayList<>(arrayListl);
        Collections.sort(expected);
        assertEquals(arrayListl,expected);

    }

}
