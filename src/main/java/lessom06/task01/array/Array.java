package lessom06.task01.array;

import java.util.*;

public class Array {
    public String[] arrayDeveloper() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер команды :  ");
        int size = input.nextInt();
        String[] array = new String[size + 1];
        System.out.println("Введите имя разработчика и должность через пробел :");

        for (int i = 0; i <= size; i++) {
            array[i] = input.nextLine();
        }
        System.out.print("Вы добавили участников  :  ");
        for (int i = 0; i <= size; i++) {
            System.out.print(" " + array[i]);
        }
        return array;
    }

    public List<String> arraySort(String[] array) {
        String[] devarray = array;
        List<String> devList = new ArrayList<String>();
        devList = Arrays.asList(devarray);
        Collections.sort(devList);
        for (int i = 0; i < devList.size(); i++) {
            System.out.println(devList.get(i));
        }
        System.out.println("----------------------------------------------------");
        return devList;
    }
}