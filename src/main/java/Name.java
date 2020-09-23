import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class Name {

        public static ArrayList name() {
            String[] name = {"Liseenko", "Avramenko", "Avdeev"};

            List<String> listName = new ArrayList<String>(Arrays.asList(name));
            System.out.println(listName);
            listName.add("Kireev");
            listName.add("Kravcov");
            listName.add("Borisov");
            Collections.sort(listName);
            for (Object i : listName) {
                System.out.println(i);
            }
            return (ArrayList) listName;

        }
}



