import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public  class Main {

    public static void main(String[] args) {

        Array.arrSort();
        Name.name();

        ArrayList forLinList = Array.arrSort();
        ArrayList forLinList2 = Name.name();
        System.out.println(forLinList);
        System.out.println(forLinList2);

        LinkedList linkedList = new LinkedList();
        linkedList.add("хня");
        linkedList.add("причем");
        linkedList.add("полнейшая");
        for (Object j : forLinList2)
            linkedList.add(j);
        for (Object i : forLinList)
            linkedList.add(i);
        System.out.println(linkedList);
    }
}


