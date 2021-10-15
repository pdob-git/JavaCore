import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        NumberUtils numberUtils = new NumberUtils();
        int number;
        final int compareTo = 5000;

        number = random.nextInt(10000);
        System.out.println("Wylosowana liczba: " + number);
        numberUtils.compareNumberAndPrint(number, compareTo);
        numberUtils.printOddOrEven(number);
        System.out.println("Uzupełniona do 4 cyfr: " + numberUtils.getFourDigitNumber(number));
    }


}
