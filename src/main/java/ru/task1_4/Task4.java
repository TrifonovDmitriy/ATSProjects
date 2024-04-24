package ru.task1_4;

public class Task4 {
    /**
     * Задачу 4 пропустил, здесь метод для задачи 5, так как он более полный
     */
    public static void method(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0 не является ни положительным, ни отрицательным, введите отличные от 0 числа");
            return;
        }
        int positiveNumber = 0, negativeNumber = 0;
        if (a > 0) positiveNumber += 1;
        else negativeNumber += 1;
        if (b > 0) positiveNumber += 1;
        else negativeNumber += 1;
        if (c > 0) positiveNumber += 1;
        else negativeNumber += 1;
        System.out.println("Положительных чисел: " + positiveNumber);
        System.out.println("Отрицательных чисел: " + negativeNumber);
    }
}
