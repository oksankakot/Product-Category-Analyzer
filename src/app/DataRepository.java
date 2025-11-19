package app;

import java.util.Arrays;
import java.util.List;

public class DataRepository {
    public List<Product> getProducts() {
        return Arrays.asList(
                new Product("Electronics", "Laptop", 1200.0),
                new Product("Appliances", "Coffee Maker", 80.0),
                new Product("Electronics", "Headphones", 150.0),
                new Product("Appliances", "Blender", 50.0)
        );
    }
}