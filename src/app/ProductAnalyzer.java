package app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductAnalyzer {

    public Map<String, Double> calculateAveragePrices(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
    }

    public Map.Entry<String, Double> findMostExpensiveCategory(Map<String, Double> averagePrices) {
        return averagePrices.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new RuntimeException("Empty list."));
    }
}
