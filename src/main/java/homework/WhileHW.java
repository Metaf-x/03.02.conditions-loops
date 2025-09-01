package homework;

import java.util.Scanner;

public class WhileHW {

    private static final Scanner scanner = new Scanner(System.in);

    public static int factorial() {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int factorial = 1;

        while(number >= 1) {
            factorial *= number;
            number--;
        }

        return factorial;
    }

    public static void printEven() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if(number < 2) {
            System.out.println("Нет четных чисел");
            return;
        }

        int counter = 2;

        while (counter <= number) {
            System.out.println(counter);
            counter += 2;
        }
    }

    public static void printNumbersTo1() {
        System.out.print("Введите число: ");
        int maxNumber = scanner.nextInt();

        while(maxNumber >= 1) {
            System.out.print(maxNumber-- + " ");
        }
    }

    public static void main(String[] args) {
//        System.out.println(factorial());
//        printEven();
//        printNumbersTo1();
    }

}
