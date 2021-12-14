package my;

public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        System.out.println("My example");
        database.add(new Person("Jan", "Kowalski", "12345"));
        database.add(new Person("Ania", "Zalewska", "234567"));
        database.add(new Person("Karol", "Piotrowski", "345678"));
        database.add(new Person("Patryk", "Bielecki", "45678"));
        Person person = database.get(1);
        System.out.println(person);
        System.out.println(database);
        System.out.println("Size: " + database.size());
        database.remove(new Person("Patryk", "Bielecki", "45678"));
        System.out.println(database);
        System.out.println("Size: " + database.size());
        database.remove(new Person("Ania", "Zalewska", "234567"));
        System.out.println(database);
        System.out.println("Size: " + database.size());
        database.add(new Person("test", "person", "1234"));
        System.out.println(database);
        System.out.println("Size: " + database.size());
        try {
            database.add(null);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
