package my;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductImporter {
    public static Map<String, TreeSet<Product>> readFile(String fileName) throws FileNotFoundException {
        Map<String, TreeSet<Product>> products = new HashMap<>();
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)){
            scanner.nextLine();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] split = line.split(";");
                String category = split[0];
                String name = split[1];
                double price = Double.parseDouble(split[2]);
                Product product = new Product(category, name, price);
                if (products.containsKey(category)){
                    TreeSet<Product> categoryProducts = products.get(category);
                    categoryProducts.add(product);
                } else {
                    TreeSet<Product> newCategoryProducts = new TreeSet<>();
                    newCategoryProducts.add(product);
                    products.put(category,newCategoryProducts);
                }
            }
        }
        return products;
    }
}
