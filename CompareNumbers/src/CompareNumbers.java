import java.util.Random;

public class CompareNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

//        int x = 61;
//        int y = 3;

        boolean result = x > y;

        System.out.println("x = " + x + "; y = " + y);

        System.out.println("x > y =  " + result);

        result = x * 2 > y;

        System.out.println("x*2 > y = " + result);
        result = (y < x + 3) && (y > x - 2);
        System.out.println("(y < x+3) && (y > x-2) = " + result);
        result = ((x * y) % 2 == 0);
        System.out.println("Czy x * y jest parzyste? " + result);
    }
}
