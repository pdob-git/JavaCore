package my;

public class Cart {
    public static final int MAX_PRODUCTS = 10;
    private Product[] products = new Product[MAX_PRODUCTS];
    private int productsNumber;

    public void add(Product product) {
        if (productsNumber < MAX_PRODUCTS) {
            products[productsNumber] = product;
            productsNumber++;
        }
    }

    public double totalCost() {
        if (this.productsNumber > 0)
            return recursiveCost(this.productsNumber - 1);
        else
            return 0;
    }

    public int getProductsNumber() {
        return productsNumber;
    }

    private double recursiveCost(int n) {
        return n > 0
                ? this.products[n].getPrice() + recursiveCost(n - 1)
                : this.products[n].getPrice();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.productsNumber; i++) {
            stringBuilder.append(this.products[i].toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
