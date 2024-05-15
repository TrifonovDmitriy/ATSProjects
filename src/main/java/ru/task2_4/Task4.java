package ru.task2_4;

public class Task4 {
    public static void multiplication(int a, int b) {
        int i = 1;
        int res = 0;
        while (i <= b) {
            res = res + a;
            i += 1;
        }
        System.out.println(res);
    }
}
