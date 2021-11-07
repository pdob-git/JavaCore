import java.util.Arrays;
import java.util.Scanner;

class EvenAdder {
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        int i = 0;
        while (i < result.length){
            System.out.println("Podaj kolejną liczbę:");
            int next = scanner.nextInt();
            if(isEven(next)){
                result[i] = next;
                i++;
            } else {
//                System.out.println("Podana liczba jest nieparzysta.");
            }

        }

        return result;
    }

    /**
     *
     * @param number - number to be checked
     * @return true if number is even, or false otherwise
     */
    private static boolean isEven(int number) {
        if (number % 2  == 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[(reversed.length -1 - i)] = array[i];
        }
        return reversed;
    }
}