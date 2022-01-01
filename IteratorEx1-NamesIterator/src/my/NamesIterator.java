package my;

import java.util.Iterator;
import java.util.TreeMap;

public class NamesIterator {
    public static void main(String[] args) {
        System.out.println("Moje rozwiązanie");

        TreeMap<String, Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("Kowalski", new Person("Jan", "Kowalski", 23));
        personTreeMap.put("Adamiak", new Person("Cezary", "Adamiak", 18));
        personTreeMap.put("Lewandowska", new Person("Gabriela", "Lewandowska", 26));

        Iterator<Person> iterator = personTreeMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
