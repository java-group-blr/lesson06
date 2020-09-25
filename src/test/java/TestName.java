import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;



public class TestName {
    String[] args = null;
    @Test
    public void testArrname() {

        List<String> listName = new ArrayList<String>(Arrays.asList(args));
        System.out.println(listName);
       listName.add("Qwer");
        listName.add("Wert");

        ArrayList<String> expected = new ArrayList<>(listName);
        Collections.sort(expected);
        assertEquals(listName,expected);

    }

}
