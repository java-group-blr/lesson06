package lessom06.task01.array;

import java.util.*;

public class ArraytoList {
    public static List<String> Teamlist(String[] array) {
        Scanner sc = new Scanner(System.in);
        String[] devarray = array;
        List<String> devList = new ArrayList<String>();
        devList = Arrays.asList(devarray);
        System.out.println("\n Вы добавили команду в список разработчиков : ");
        System.out.println("Введите название команды");
        String name = sc.nextLine();
        System.out.println("\n Команда одобрена и отсортирована по алфавиту : ");
        System.out.println("Команда создана : " + name);
        System.out.println("----------------------------------------------------");
        Collections.sort(devList);
        for (int i = 0; i < devList.size(); i++) {
            System.out.println(devList.get(i));
        }
        System.out.println("----------------------------------------------------");
    return devList ;
    }
}