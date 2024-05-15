package ru.task2_2;

public class Task2 {
    public static void increaseAmoebas() {
        // 24/3=8 - количество итераций деления, посути это 2 в 8, равно 256
        int countAmoebas = 1;
        int hour = 0;
        while (hour < 24) {
            countAmoebas *= 2;
            hour += 3;
            System.out.println("Через " + hour + " час(а) " + countAmoebas + " амёб(ы)");
        }
    }
}
