import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Name  {

        public static void name() {
            String[] name = {"Liseenko", "Avramenko", "Avdeev"};

            List<String> listName = new ArrayList(10);
            listName = Arrays.asList(name);
            for (String str : listName) ;
            System.out.println(listName);
            Collections.sort(listName);
            for (Object i : listName) {

                System.out.println(i);
            }
        }
}



