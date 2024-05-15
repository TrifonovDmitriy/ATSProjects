package ru.task2_5;

public class Task5 {
    private static final double INCH = 2.54;
    public static void converter() {
        System.out.println("+----+--------+"); // попробуем нарисовать кривую табличку)
        double sm;
        for (int i = 1; i <= 20; i++) {
            sm = i * INCH;
            System.out.println("| " + i + " | " + sm);
            System.out.println("+----+--------+");
        }
    }
}
