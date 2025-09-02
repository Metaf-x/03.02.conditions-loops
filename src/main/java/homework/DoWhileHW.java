package homework;

import java.util.Scanner;

public class DoWhileHW {

    private static final Scanner scanner = new Scanner(System.in);

    public static void requestPositiveNumber() {
        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while(number <= 0);

        System.out.println("Введено положительное число. Программа остановлена.");
    }

    public static void checkPassword() {
        String password = "123";
        String input;

        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
        } while (!input.equals(password));

        System.out.println("Пароль верный.");
    }

    public static void print1to10() {
        int counter = 1;

        do {
            System.out.print(counter++ + " ");
        } while(counter <= 10);
    }

    public static void stopOnExit() {
        String input;

        do {
            System.out.print("Введите команду: ");
            input = scanner.nextLine();
        } while (!input.equals("exit"));

        System.out.println("Выход из программы.");
    }

    public static void countDigits() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int counter = 0;

        do {
            counter++;
            number /= 10;
        } while (number > 0);

        System.out.println("Количество чисел: " + counter);
    }

    public static void main(String[] args) {
//        requestPositiveNumber();
//        checkPassword();
//        print1to10();
//        stopOnExit();
//        countDigits();
    }

}
