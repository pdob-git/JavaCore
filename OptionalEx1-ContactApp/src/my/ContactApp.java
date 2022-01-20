package my;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        System.out.println("Moje rozwiązanie");
        String fileName = "contacts.csv";
        Optional<ContactManager> contactManagerOptional = ContactReader.readFile(fileName);

        contactManagerOptional.ifPresentOrElse(
                ContactApp::searchForEmail,
                ContactApp::fileReadError);


    }

    private static void showContactInfo(Contact contact) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contact.getShortInfo());
    }

    private static void emptyContactMessage() {
        System.out.println("Brak kontaktu o wskazanym adresie e-mail");
    }

    private static void searchForEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        Optional<Contact> contactByEmail = contactManager.findByEmail(email);

        contactByEmail.ifPresentOrElse(
                ContactApp::showContactInfo,
                ContactApp::emptyContactMessage);
    }

    private static void fileReadError() {
        System.out.println("Błąd odczytu danych z pliku");
    }
}