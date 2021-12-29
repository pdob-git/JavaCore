import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class NotebookStore {
    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

        // wyświetlamy zbiór kluczy
        System.out.println("Modele laptopów: ");
        Set<String> keys = notebooks.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // wyświetlamy informację o laptopach na podstawie kluczy
        String key = "G2A33EA";
        System.out.println("Znaleziono laptop o kodzie G2A33EA: ");
        Notebook foundNotebook = notebooks.get(key);
        System.out.println(foundNotebook);

        // usuwamy obiekt na podstawie klucza
        notebooks.remove("XPS0091V");

        System.out.println("Ilość produktów w sklepie: " + notebooks.size());
    }
}