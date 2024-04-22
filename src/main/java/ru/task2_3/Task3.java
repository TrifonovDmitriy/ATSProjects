package ru.task2_3;

public class Task3 {
    public static void summaNumber() {
        int a = 1;
        int res = 0;
        while (a <= 256) {
            res += a;
            a *= 2;
        }
        System.out.println("Сумма чисел равна: " + res);
    }
}
