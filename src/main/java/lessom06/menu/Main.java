package lessom06.menu;

import lessom06.task01.array.ArraytoList;
import lessom06.task01.array.Array;
import lessom06.task02.arraylist.ArrayListDeveloper;
import lessom06.task02.arraylist.ListDeveloper;
import lessom06.task03.linkedlist.LinkedList;
import lessom06.task03.linkedlist.LinkedListDeveloper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Array array = new Array();
//        ArraytoList developerLIst = new ArraytoList();
//        ListDeveloper<String> developer = new ArrayListDeveloper<>();
        LinkedListDeveloper<String> linkedDeveloper = new LinkedListDeveloper<>();
        linkedDeveloper.addLast("Александр java developer");
        linkedDeveloper.addLast("Никита android developer");
        linkedDeveloper.addFirst("Катя IOs developer");
        linkedDeveloper.addLast("Инесса C ++ developer");
        linkedDeveloper.addFirst("Женя QA developer");
       linkedDeveloper.addLast("Миша Team Leader");
        System.out.println(linkedDeveloper.size());
        System.out.println(linkedDeveloper.getIndex(1));
        System.out.println("---------------------------------");
        System.out.println(linkedDeveloper.getIndex(4));
        System.out.println("--------------------------");
        for (String dev : linkedDeveloper){
            System.out.println(dev);
        }



//        developer.add("Александр java developer");
//        developer.add("Никита android developer");
//        developer.add("Катя IOs developer");
//        developer.add("Инесса C ++ developer");
//        developer.add("Женя QA developer");
//        developer.add("Миша Team Leader");
//        System.out.println("--------------------------------");
//        for (String d : developer){
//            System.out.println(d);
//        }
//        System.out.println("--------------------------------");
//        System.out.println(developer.get(1));
//        System.out.println("--------------------------------");
//        System.out.println(developer.size());
//        System.out.println("--------------------------------");
//        developer.update(3 ,"Вика С# developer");
//        System.out.println(developer.get(3));
//        System.out.println("--------------------------------");
//        developer.delete(1);
//        for (String d : developer){
//            System.out.println(d);
//        }
//        System.out.println("--------------------------------");
//        System.out.println("1.Создать новую команду через массив и ");
//        System.out.println(" внести в список разработчиков : ");
//        int number = sc.nextInt();
//        switch (number) {
//            case 1:
//                String[] partyDev = array.arrayDeveloper();
//                developerLIst.Teamlist(partyDev);
//                break;
        }
    }
