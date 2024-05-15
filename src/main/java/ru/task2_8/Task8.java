package ru.task2_8;

public class Task8 {
    public static void triangle1(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void triangle2(int row2) {
        for (int i = 0; i < row2; i++) {
            for (int k = 0; k <= i - 1; k++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < row2 - i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
