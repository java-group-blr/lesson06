package lessom06.menu;

import lessom06.task01.devlist.DeveloperLIst;
import lessom06.task01.array.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        DeveloperLIst developerLIst = new DeveloperLIst();
        String[]  partyDev = array.developerArray();
        developerLIst.developerlist(partyDev);

    }
}