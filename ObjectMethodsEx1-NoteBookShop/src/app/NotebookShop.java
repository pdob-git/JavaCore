package app;

import model.Computer;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Computer apple = new Computer("Apple", 1);

        dataStore.add(new Computer("Apple", 1));
        dataStore.add(new Computer("Dell", 2));
        dataStore.add(new Computer("Lenovo", 3));
        dataStore.add(new Computer("Samsung", 4));
        dataStore.add(new Computer("Apple", 1));

        System.out.println("Wszystkie dostępne komputery: ");
        for (Computer c : dataStore.getComputers()) {
            System.out.println(c);
        }

        System.out.println();

        System.out.println("Number of apple in store: " + dataStore.checkAvailability(apple));
    }
}
