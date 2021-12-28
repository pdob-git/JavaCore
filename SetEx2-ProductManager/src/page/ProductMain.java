package page;

import javax.sound.midi.Soundbank;

class ProductMain {
    public static void main(String[] args) {
        System.out.println("Rozwiązanie z kursu");
        ProductManager productManager = new ProductManager();
        productManager.mainLoop();
    }
}