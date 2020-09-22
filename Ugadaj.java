import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Ugadaj {
    public static void main(String[] args) {
        int n = 0;
        int user_number=0;
        Scanner input = new Scanner(System.in);
        System.out.println("ДАВАЙТЕ ПОИГРАЕМ! Я угадаю Ваше число!");
        int search_results = (int) (Math.random() * 100);
        System.out.print("Введите ваше число: ");

        //ОТЛОВ ОШИБОК!
        try {
        user_number = input.nextInt();
        } catch (Exception e) {
            System.out.print("Некорректный ввод! Вы ввели не целое число! Я так не играю!");
            System.exit(0);
        }

            do {
                n++;
                if (user_number > search_results) {
                    search_results++;
                } else {
                    if (user_number < search_results) {
                        search_results--;
                    }
                }
            } while (user_number != search_results);
            System.out.print("СТОП ИГРА! Я УГАДАЛ!");
            System.out.println("\nВаше число: " + search_results);
            System.out.println("Я угадал Ваше число с " + n + " раза!");
    }
}