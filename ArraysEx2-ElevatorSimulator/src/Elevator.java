public class Elevator {
    private final int personLimit = 4;
    private int personCount = 0;
    private final int weightLimit = 400;
    private int totalWeight = 0;
    private final Person[] people = new Person[4];

    public void add(Person person) {
        if (personCount < 4) {
            people[personCount] = person;
            System.out.println("Wsiadła jedna osoba " + person.getId() + " " + person.getWeight() + "kg");
            personCount++;
            totalWeight += person.getWeight();
        }
        else {
            System.out.println("Nie ma miejsca w windzie. Liczba osób w windzie: " + personCount);
        }

    }

    public void start() {

        if (getTotalWeight() > weightLimit) {
            System.out.println("Winda jest przeciążona o " + (getTotalWeight() - weightLimit) + "kg");
        }
        else {
            System.out.println("Winda wystartowała");
        }

    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    public void clear() {
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;
        personCount = 0;
        totalWeight = 0;
        System.out.println("Winda jest pusta");
    }
}
