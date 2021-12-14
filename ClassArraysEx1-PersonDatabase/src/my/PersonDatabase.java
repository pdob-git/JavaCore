package my;

import java.util.Arrays;

public class PersonDatabase {
    private static final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 0;

    public Person[] getPeople() {
        return people;
    }

    public void add(Person p) {
        if (p == null) {
            throw new NullPointerException("person cannot be null");
        }
        if (emptyPlace == people.length) {
            people = Arrays.copyOf(people, people.length * 2);
        }
        people[emptyPlace] = p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if (p == null) {
            throw new NullPointerException("person cannot be null");
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals(p)) {
                if (i == people.length - 1) {
                    people[i] = null;
                    emptyPlace = i;
                    return;
                } else {
                    System.arraycopy(people, i+1, people, i, people.length -1 - i);
                    emptyPlace--;
                    people[emptyPlace]=null;
                }
                return;
            }
        }
    }

    public Person get(int index) {
        return people[index];
    }

    public int size() {
        return emptyPlace;
    }

    @Override
    public String toString() {
        return "PersonDatabase{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
