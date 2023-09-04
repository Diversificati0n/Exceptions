package hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();

            if (firstNumber > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            if (secondNumber < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }

            if (firstNumber + secondNumber < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }

            System.out.print("Введите третье число: ");
            int thirdNumber = scanner.nextInt();

            if (thirdNumber == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }

            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }
    }
}

