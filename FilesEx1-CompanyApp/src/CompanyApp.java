
//My solution of lesson example
import java.util.Scanner;

public class CompanyApp {
    private static final int INPUT_AND_SAVE_DATA = 1;
    private static final int READ_AND_OUTPUT_DATA = 2;
    private static Company company = new Company();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadzanie danych pracowników - " + INPUT_AND_SAVE_DATA);
        System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_AND_OUTPUT_DATA);
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case INPUT_AND_SAVE_DATA:
                getAndSaveCompany(scanner);
                break;
            case READ_AND_OUTPUT_DATA:
                readAndShowCompany();
                break;
            default:
                System.out.println("Nie prawidłowa opcja uruchom program jeszcze raz");
        }

        scanner.close();

    }

    private static void readAndShowCompany() {
        ObjectReader objectReader = new ObjectReader();
        company = objectReader.readCompany();
        System.out.println(company);
    }

    private static void getAndSaveCompany(Scanner scanner) {
        for (int i = 0; i < company.getMAX_EMPLOYEES(); i++) {
            System.out.println("Podaj imię pracownika");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko pracownika");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wynagrodzenie");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            company.addEmployee(new Employee(firstName, lastName, salary));
        }
        ObjectWriter objectWriter = new ObjectWriter();
        objectWriter.saveCompany(company);
    }
}
