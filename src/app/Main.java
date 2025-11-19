package app;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DataRepository dataRepository = new DataRepository();
        ProductAnalyzer productAnalyzer = new ProductAnalyzer();
        List<Product> products = dataRepository.getProducts();

        Map<String, Double> averageProducts = productAnalyzer.calculateAveragePrices(products);
        System.out.println("-------------------");
        System.out.println("Average price by category: ");
        averageProducts.forEach(
                (category, price) ->
                        System.out.println("- " + category + " average category price: " + price));

        Map.Entry<String, Double> topPriceCategory = productAnalyzer.findMostExpensiveCategory(averageProducts);
        System.out.println("-------------------");
        System.out.println("The most expensive average price is in category: "
                + topPriceCategory.getKey() + " with average price " + topPriceCategory.getValue());
    }
}
