package ru.task2_7;

public class Task7 {
    public static void method() {
        int res = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                res = res + i;
            }
        }
        System.out.println(res);
    }
}
