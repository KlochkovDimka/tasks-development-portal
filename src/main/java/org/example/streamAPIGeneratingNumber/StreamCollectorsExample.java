package org.example.streamAPIGeneratingNumber;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class StreamCollectorsExample {

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );

        // Группируем и складываем стоимость продуктов
        Map<String, Double> groupProduct = orders.stream()
                .collect(groupingBy(Order::getProduct,
                        summingDouble(Order::getCost)));

        // Сортируем от большего к меньшему и оставляем 3 самых дорогих
        List<Map.Entry<String, Double>> listProduct = groupProduct.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .toList();
        
        listProduct.forEach(System.out::println);
    }
}
