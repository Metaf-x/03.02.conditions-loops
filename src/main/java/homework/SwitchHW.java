package homework;

import java.util.Scanner;

public class SwitchHW {

    private static final Scanner scanner = new Scanner(System.in);

    public static String weekdayFromNumber() {
        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();
        String result;

        switch (day) {
            case 1: result = "Понедельник";
                break;
            case 2: result = "Вторник";
                break;
            case 3: result = "Среда";
                break;
            case 4: result = "Четверг";
                break;
            case 5: result = "Пятница";
                break;
            case 6: result = "Суббота";
                break;
            case 7: result = "Воскресенье";
                break;
            default: result = "Такого дня недели не существует";
        }
        return result;
    }

    public static String priceByDay() {
        System.out.print("Введите число дня недели: ");
        int day = scanner.nextInt();

        String price;

        switch(day) {
            case 1, 2, 3, 4, 5 -> price = "Стоимость: 300 рублей";
            case 6, 7 -> price = "Стоимость: 450 рублей";
            default -> price = "Неверный день недели";
        }

        return price;
    }

    public static char gradesToLetters() {
        System.out.print("Введите оценку: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 100) throw new ArithmeticException();

        int singleNumber = number / 10;
        char letterGrade;

        switch (singleNumber) {
            case 10, 9 -> letterGrade = 'A';
            case 8 -> letterGrade = 'B';
            case 7 -> letterGrade = 'C';
            default -> letterGrade = 'F';
        }

        return letterGrade;
    }

    public static void commandReader() {
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезагружена");
                break;
            case "status":
                System.out.println("Проверка статуса системы...");
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }

    public static void calculator() {
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите операцию: ");
        String operator = scanner.nextLine();

        if (b == 0 && operator.equals("/")) {
            throw new ArithmeticException();
        }

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Неизвестно");
        }
    }

    public static void main(String[] args) {
//        System.out.println(weekdayFromNumber());
//        System.out.println(priceByDay());
//        System.out.println(gradesToLetters());
//        commandReader();
//        calculator();
    }
}
