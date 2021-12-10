package my;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("pomidory", 2.50d));
        cart.add(new Product("banany", 5.00d));
        cart.add(new Product("papryka", 7.00d));

        System.out.println("Karta zakupów:");
        System.out.print(cart);
        System.out.println("Cena koszyka: " + cart.totalCost());
    }
}
