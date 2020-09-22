package by.lesson06;

import java.util.Scanner;

public class Array {

    public int[] array() {
        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int[] array = new int[length1];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int length2 = scanner.nextInt();
        array = new int[length2];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        return array;
    }
}
