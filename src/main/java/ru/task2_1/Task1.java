package ru.task2_1;

public class Task1 {
    public static void runer() {
        double distance = 10;
        double result = distance;
        for (int i = 0; i < 6; i++) {
            distance = distance + distance * 0.1;
            result = result + distance;
        }
        System.out.println("Суммарное расстояние за 7 дней пробежек равно: " + Math.round(result * 100.0) / 100.0 + " км"); // округлим до сотых
    }
}
