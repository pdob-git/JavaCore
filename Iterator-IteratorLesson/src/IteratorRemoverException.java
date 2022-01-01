import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Pętli for each nie wykorzystujemy do dodawania lub usuwania elementów w kolekcji

class IteratorRemoverException {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

        // pętla ok, bo nie korzystamy z iteratora
        System.out.println(">>> Pętla 1");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
            if (name.equals("Basia")) {
                names.remove(name);
                i--;
            }
        }
        System.out.println(names);

        Iterator<String> namesIterator = names.iterator();
        System.out.println(">>> Pętla 2");
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                // błąd - iterujemy po kolekcji za pomocą iteratora, a usuwamy
                // obiekt metodą remove() bezpośrednio z kolekcji
//                names.remove(name);

                //dobry
                namesIterator.remove();
            }
        }
        System.out.println(names);

        System.out.println(">>> Pętla 3");
        for (String name : names) {
            System.out.println(name);
            if (name.equals("Maniek")) {
                // błąd - iterujemy po kolekcji za pomocą niejawnego iteratora
                // petli for-each, a usuwamy
                // obiekt metodą remove() bezpośrednio z kolekcji
                names.remove(name);
            }
        }
        System.out.println(names);

    }
}