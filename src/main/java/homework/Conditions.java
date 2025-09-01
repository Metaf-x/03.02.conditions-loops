package homework;

import java.util.Scanner;

public class Conditions {

    private static final Scanner scanner = new Scanner(System.in);

    public static void defineSign() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println("Число положительное");
        } else if(number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static String findMax() {
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        String result = "";

        if(a > b) {
            result = "Первое число больше второго";
        } else if(b > a) {
            result = "Второе число больше первого";
        } else {
            result = "Числа равны";
        }
        return result;
    }

    public static String gradeNumberToWord() {
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();

        String result = switch(grade) {
            case 5 -> "Отлично";
            case 4 -> "Хорошо";
            case 3 -> "Удовлетворительно";
            case 2, 1 -> "Неудовлетворительно";
            default -> "Нет такой оценки";
        };

        return result;
    }

    public static boolean isEven() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isEven = number % 2 == 0;

        return isEven;
    }

    public static void calcDiscountFromAge() {
        System.out.print("Укажите свой возраст: ");
        int age = scanner.nextInt();
        int discount;

        if(age < 18) {
            discount = 25;
        } else if (age >= 65) {
            discount = 30;
        } else {
            discount = 0;
        }
        System.out.println("Размер вашей скидки: " + discount);
    }

    public static String testResultToWords() {
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();
        String result = "";

        if(grade > 100 || grade < 0) {
            result = "Неверная оценка";
            return result;
        }

        if(grade >= 90) {
            result = "Отлично";
        } else if (grade <= 89 && grade >= 75) {
            result = "Хорошо";
        } else if (grade <= 74 && grade >=60) {
            result = "Удовлетворительно";
        } else {
            result = "Неудовлетворительно";
        }

        return result;
    }

    public static void main(String[] args) {
//        defineSign();
//        System.out.println(findMax());
//        System.out.println(gradeNumberToWord());
//        System.out.println(isEven());
//        calcDiscountFromAge();
//        System.out.println(testResultToWords());
    }

}
