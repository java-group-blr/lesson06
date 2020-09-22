package by.lesson06;

import java.util.ArrayList;
import java.util.Collections;

public class List {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> isSortedArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(58);
        arrayList.add(58);
        arrayList.add(10);
        arrayList.add(110);
        arrayList.add(0);
        arrayList.add(9);
        arrayList.add(77);
        arrayList.add(66);
        arrayList.add(58);
        arrayList.add(90);
        arrayList.add(-3);

        Collections.sort(arrayList);

        for (Integer i : arrayList) {
            System.out.println(i);
        }
        return arrayList;
    }
}