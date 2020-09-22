import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Массив:");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i < 10; i++) {
            Collections.addAll(arr,(int) (Math.random() * 100));
        }
        //Collections.addAll(arr,5,2,4,1,3);
        arr.forEach(elem -> System.out.print(elem + " "));

        System.out.println("\nСортировка массива по убыванию:");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j+1) > arr.get(j)){
                    Integer temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        arr.forEach(elem -> System.out.print(elem + " "));

        System.out.println("\nСортировка массива по возрастанию:");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j+1) < arr.get(j)){
                    Integer temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        arr.forEach(elem -> System.out.print(elem + " "));

    }
}