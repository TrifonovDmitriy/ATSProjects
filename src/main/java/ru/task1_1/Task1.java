package ru.task1_1;

public class Task1 {
    public static void isNumber(int a) {
        int lenght = String.valueOf(a).length(); // преобразуем int в обёртку класса Стринг и посчитает длину строки
        String meaning;
        if (a > 0) {
            meaning = "положительное";
        } else if (a < 0) {
            lenght -= 1; // уменьшаем длину строки на 1, так как "-" считается тоже символом
            meaning = "отрицательное";
        } else {
            System.out.println("Это ноль!");
            return; // если ноль то сообщаем и выходим
        }
        String quantity;
        if (lenght == 1) {
            quantity = "однозначное";
        } else if (lenght == 2) {
            quantity = "двузначное";
        } else {
            quantity = "многозначное";
        }
        System.out.println(a + ": это " + quantity + " " + meaning + " число");
    }
}
