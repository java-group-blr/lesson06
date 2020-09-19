import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void arrSort() {
int[] nom = {34,65,24};

        ArrayList<Integer> arraylist = new ArrayList<Integer>(10);
        Collections.addAll(arraylist, 34,65,24);
        arraylist.add(10);
        arraylist.add(4);
        arraylist.add(12);
        arraylist.add(18);
        arraylist.add(1);
        arraylist.remove(0);
        System.out.println(arraylist);
        Collections.sort(arraylist);
                for (Object i : arraylist) {
                System.out.println(i);
            }
    }
}

