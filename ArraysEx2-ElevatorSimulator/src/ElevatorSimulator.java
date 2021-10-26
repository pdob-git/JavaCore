public class ElevatorSimulator {
    public static void main(String[] args) {
        Person person1 = new Person(1, 80);
        Person person2 = new Person(2, 120);
        Person person3 = new Person(3, 60);
        Person person4 = new Person(4, 140);
        Person person5 = new Person(5, 30);
        Elevator elevator = new Elevator();

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
//        elevator.add(person4);
//        elevator.add(person5);
        elevator.start();
        System.out.println("Masa osób w windzie: " + elevator.getTotalWeight() + "kg");
        elevator.clear();

    }
}
