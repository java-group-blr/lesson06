import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

public static void main(String[]args) {
    int[] array = new int[15];
    for (int i = 0; i < array.length; i++) {
        array[i] = (int)(Math.random() * 100);
    }
    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

    }
}