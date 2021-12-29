package my;

import java.util.*;

public class CompanyApp {
    private static final int ADD_EMPLOYEE = 0;
    private static final int FIND_EMPLOYEE = 1;
    private static final int EXIT = 2;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        scanner.useLocale(Locale.US);

        //initial data
        company.addEmployee(new Employee("Jan", "Kowalski", 4_500));
        company.addEmployee(new Employee("Róża", "Gabryjelska", 5_500));
        company.addEmployee(new Employee("Paweł", "Niewiadomski", 10_000));

        System.out.println("Moje rozwiązanie");
        boolean loopVariable = true ;
        do {
            printOptions();
            int option;
            option = getOption();

            switch (option){
                case ADD_EMPLOYEE:
                    addEmployee(company);
                    break;
                case FIND_EMPLOYEE:
                    findEmployee(company);
                    break;
                case EXIT:
                    loopVariable = false;
                    break;
                default:
                    System.out.println("Zła opcja spróbuj jeszcze raz");
            }
        } while (loopVariable);

        scanner.close();

        Set<Map.Entry<String, Employee>> entries = company.getEmployees().entrySet();
        for (Map.Entry<String, Employee> entry : entries) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println("Koniec Programu");

    }

    private static void findEmployee(Company company) {
        System.out.println("Podaj imię pracownika");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        String lastName = scanner.nextLine();
        Employee foundEmployee = company.getEmployee(firstName, lastName);
        if (foundEmployee != null){
            System.out.println("\nZnaleziony pracownik");
            System.out.println(foundEmployee);
        } else {
            System.err.println("Nie znaleziono pracownika");
        }
    }

    private static void addEmployee(Company company) {
        System.out.println("Podaj imię pracownika");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wysokość wynagrodzenia pracownika");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(firstName, lastName, salary);
        company.addEmployee(employee);
    }

    private static int getOption() {
        int option;
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException  e) {
            option = -1;
        } finally {
            scanner.nextLine();
        }
        return option;

    }

    private static void printOptions() {
        System.out.println();
        System.out.println(ADD_EMPLOYEE + " - Dodanie pracownika");
        System.out.println(FIND_EMPLOYEE + " - Wyszukiwanie pracownika");
        System.out.println(EXIT + " - Wyjście z programu");
    }
}
