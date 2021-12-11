package my;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class NumbersReader {
    public static final String FILE_NAME= "numbers.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        String[] values = null;
        int linesCounter = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                scanner.nextLine();
                linesCounter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        }

        try (Scanner scanner1 = new Scanner(file)) {

            values = new String[linesCounter];

            for (int i = 0; i < values.length; i++) {
                values[i] = scanner1.nextLine();

            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        }

        if (values != null){
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int c = Integer.parseInt(values[2]);
            int abc = a + b + c;
            System.out.println("a + b + c = " + abc);
            BigInteger aBig = new BigInteger(values[3]);
            BigInteger bBig = new BigInteger(values[4]);
            BigInteger bigIntegerResult = aBig.add(bBig);
            System.out.println("aBig + bBig = " + bigIntegerResult);
        }
    }

}
