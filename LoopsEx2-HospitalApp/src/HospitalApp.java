import logic.Hospital;
import model.Patient;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
//        patient.printPatient();
//        Patient patient = new Patient("Kasia", "Pączkowska", "80091505446");

        Scanner scanner = new Scanner(System.in);
        int loopControl = -1;
        final Hospital hospital = new Hospital();

        String firstName;
        String lastName;
        String PESEL;

        while (loopControl != 0) {
            System.out.println("Wybierz opcję");
            System.out.println("0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy ");
            loopControl = scanner.nextInt();
            scanner.nextLine();
            switch (loopControl) {
                case 1:
                    System.out.println("Dodawanie pacjenta");
                    System.out.println("Podaj imię");
                    firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko");
                    lastName = scanner.nextLine();
                    System.out.println("Podaj PESEL");
                    PESEL = scanner.nextLine();
                    hospital.addPatient(new Patient(firstName, lastName, PESEL));
                    break;
                case 2:
                    System.out.println("Wyświetlanie pacjentów");
                    hospital.printPatients();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Zła opcja, spróbuj ponownie");
                    break;
            }
        }

        scanner.close();
    }
}
