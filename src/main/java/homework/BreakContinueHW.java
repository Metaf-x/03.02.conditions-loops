package homework;

import java.util.Scanner;

public class BreakContinueHW {
    private static final Scanner scanner = new Scanner(System.in);

    public static void sumPositives() {
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0) break;
            sum += number;
        }

        System.out.println(sum);
    }

    public static void skipDivisibleBy3() {
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
    }

    public static void printOnlyPositives() {

        while (true) {
            System.out.print("Введите число (0 для выхода): ");
            int number = scanner.nextInt();
            if (number < 0) continue;
            if (number == 0) break;
            System.out.println("Введено положительное число: " + number);
        }
    }

    public static void exitOnStop() {

        while (true) {
            System.out.print("Ввод: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
//        sumPositives();
//        skipDivisibleBy3();
//        printOnlyPositives();
//        exitOnStop();
    }
}
