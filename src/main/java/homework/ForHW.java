package homework;

import java.util.Scanner;

public class ForHW {
    private static final Scanner scanner = new Scanner(System.in);

    public static void divisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sumOfNumbers() {
        System.out.print("Введите число: ");
        int maxNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= maxNumber; i++) {
            sum += i;
        }

        return sum;
    }

    public static void multiplyTable() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }

    public static boolean isPrime() {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void printFrom1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
//        divisibleBy3();
//        System.out.println(sumOfNumbers());
//        multiplyTable();
//        System.out.println(isPrime());
        printFrom1to10();
    }
}
