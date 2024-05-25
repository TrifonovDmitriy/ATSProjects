package ru.shop;

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private Map<Integer, Product> productMap;

    public Shop() {
        productMap = new LinkedHashMap<>(); // воспользуемся колл. мап с запоминающей последовательностью порядка вставки
    }

    @Override
    public String toString() {
        return "Shop{" +
                "productMap=" + productMap +
                '}';
    }

    public void addProduct(Product obj) {
        if (!productMap.containsKey(obj.getId())) { //проверка, чтобы не записывать товар с существующим id
            productMap.put(obj.getId(), obj);
        } else {
            System.out.println("Товар не добавлен! Товар с указанным id (" + obj.getId() + ") уже существует в магазине!");
        }
    }

    public void delProduct(int id) {
        if (productMap.containsKey(id)) {
            productMap.values().remove(productMap.get(id));
        } else {
            System.out.println("Товар не удалён! Указанный id товара (" + id + ") не найден");
        }
    }

    public void sortedByPrice() {
        //Запишем отсортированную колл в список (лист), сортировка товара по цене, с помощью созданного потока значений элементом колл., далее компаратор используется для сравнения элементов в потоке значений
        //, сравниваем цену товара с помощью метода getPrice, nullsLast указывает что знач null должны быть рассмотрены как наиб. или наим. знач. в сортировке в зависимости от порядка.
        List<Product> sortedProducts = productMap.values().stream()
                .sorted(Comparator.comparing(Product::getPrice, Comparator.nullsLast(Comparator.naturalOrder())))
                .collect(Collectors.toList());
        System.out.println(sortedProducts);
    }

    public void sortedByReverse() {
        //В колл. список запишем мапу с множеством значений, далее развернём последовательность в обратном порядке.
        List<Map.Entry<Integer, Product>> reverseMap = new ArrayList<>(productMap.entrySet());
        Collections.reverse(reverseMap);
        System.out.println(reverseMap);
    }

    public void editProduct(Product obj, String newName, int newPrice) {
        if (productMap.containsKey(obj.getId())) {
            obj.setName(newName);
            obj.setPrice(newPrice);
            productMap.put(obj.getId(), obj);   //перезапишем продукт с новыми значениями
        } else {
            System.out.println("Невозможно отредактировать, товар не добавлен в магазин");
        }
    }
}



