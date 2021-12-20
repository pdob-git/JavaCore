package my;

import java.util.Arrays;
import java.util.Comparator;

public class NumbersComparator {

    public static void main(String[] args) {

        Integer[] numbers = {4, 5, 7, 1, 3, 0, 2, 8, 20,22,21,9,12,13,16,17,18,19,30,31};
        System.out.println(numbers.length);
        Integer[] numbersAscending = Arrays.copyOf(numbers, numbers.length);
        Integer[] numbersDescending = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Nieposortowana: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbersAscending, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return Integer.compare(integer,t1);
            }
        });

        System.out.println("Posortowana rosnąco: ");
        System.out.println(Arrays.toString(numbersAscending));

        Arrays.sort(numbersDescending, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return -Integer.compare(integer,t1);
            }
        });

        System.out.println("Posortowana malejąco: ");
        System.out.println(Arrays.toString(numbersDescending));

    }
}
