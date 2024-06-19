package ru.shop;

public class Main {
    public static void main(String[] args) {
        //создаём магазин и товары
        Shop shop = new Shop();
        Product product1 = new Product(5, "Apple", 5);
        Product product2 = new Product(2, "Cherry", 2);
        Product product3 = new Product(3, "Banana", 7);
        //добавляем товары в магазин
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        System.out.println("Сортируем товары в магазине по цене по возрастанию");
        shop.sortedByPrice();
        //удаляем товар
        shop.delProduct(5);
        System.out.println("Сортируем товары по порядку добавления, последние добавленные в начале");
        shop.sortedByReverse();
        //редактируем товар
        shop.editProduct(product2, "Milk", 8);
        System.out.println("Получаем список товаров. По умолчанию список выводит в порядке добавления, последние в конце");
        System.out.println(shop);
    }
}
