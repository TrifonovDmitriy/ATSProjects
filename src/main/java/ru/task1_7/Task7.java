package ru.task1_7;

public class Task7 {
    public static String getProgrammer(int count) {
        if (count % 100 >= 11 && count % 100 <= 14) {
            return count + " программистов";
        } else if (count % 10 == 1) {
            return count + " программист";
        } else if (count % 10 >= 2 && count % 10 <= 4) {
            return count + " программиста";
        } else {
            return count + " программистов";
        }
    }
}
