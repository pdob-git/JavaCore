package my;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductManager {
    private static Map<String, TreeSet<Product>> products = new HashMap<String, TreeSet<Product>>();

    public static void main(String[] args) {

        System.out.println("Moje rozwiązanie");
        final String fileName = "products.csv";
        try {
            products = ProductImporter.readFile(fileName);
            String category = getCategoryFromUser();
            showStatisticsIfCategoryOK(category);
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku: " + fileName);
        }

        System.out.println("Koniec programu");
    }

    private static void showStatisticsIfCategoryOK(String category) {
        if (validateCategory(category)){
            showStatistics(category);
        } else {
            System.err.println("Niepoprawna kategoria");
        }
    }

    private static boolean validateCategory(String category) {
        return products.containsKey(category);
    }

    private static void showStatistics(String category) {
        TreeSet<Product> categoryProducts = ProductManager.products.get(category);
        showCategoryProducts(categoryProducts);
        showCategoryAveragePrice(categoryProducts);
        showCheapestProduct(categoryProducts);
        showMostExpensiveProduct(categoryProducts);
    }

    private static String getCategoryFromUser() {
        String category;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj nazwę kategorii do wyświetlenia statystyk:");
            category = scanner.nextLine();
        }
        return category;
    }

    private static void showMostExpensiveProduct(TreeSet<Product> categoryProducts) {
        Product mostExpensiveProduct = categoryProducts.last();
        System.out.println("Najdroższy product: " + mostExpensiveProduct);
    }

    private static void showCheapestProduct(TreeSet<Product> categoryProducts) {
        Product cheapestProduct = categoryProducts.first();
        System.out.println("Najdroższy product: " + cheapestProduct);
    }

    private static void showCategoryProducts(TreeSet<Product> categoryProducts) {
        for (Product categoryProduct : categoryProducts) {
            System.out.println(categoryProduct);
        }
    }

    private static void showCategoryAveragePrice(TreeSet<Product> categoryProducts) {
        int counter = 0;
        double sum = 0;
        for (Product categoryProduct : categoryProducts) {
            sum += categoryProduct.getPrice();
            counter++;
        }
        double average = sum / counter;
        System.out.printf("Średnia cena produktów: %.2f \n",average);
    }
}
