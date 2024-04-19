package ru.task1_2;

public class Task2 {
    public static void triangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Введены недопустимые значения, три стороны треугольника должны быть больше 0");
            return;
        }
        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            System.out.println("Такой треугольник НЕ существует");
        } else {
            System.out.println("Такой треугольник существует");
        }
    }
}
