package Hw1;
import java.util.Scanner;



//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет,
//        является ли оно положительным. Если число отрицательное или равно нулю,
//        программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
//        В противном случае, программа должна выводить сообщение "Число корректно".


//class InvalidNumberException extends Exception {
//    public InvalidNumberException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//
//        try {
//            if (number <= 0) {
//                throw new InvalidNumberException("Некорректное число");
//            } else {
//                System.out.println("Число корректно");
//            }
//        } catch (InvalidNumberException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//}

//Задача 2:
//        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю,
//        программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//        В противном случае, программа должна выводить результат деления.

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double numerator = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double denominator = scanner.nextDouble();

        try {
            if (denominator == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } else {
                double result = numerator / denominator;
                System.out.println("Результат деления: " + result);
            }
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }
    }
}

