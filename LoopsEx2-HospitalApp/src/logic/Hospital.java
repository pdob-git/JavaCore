package logic;

import model.Patient;

public class Hospital {

    private final int maxPatientsNumber = 10; //maxymalna liczba pacjentów
    private final Patient[] patients = new Patient[maxPatientsNumber]; //tablica na pacjentów
    private int regPatients = 0; //aktualna liczba pacjentów

    public void addPatient(Patient patient) {
        if (regPatients < maxPatientsNumber) {
            patients[regPatients] = patient;
            regPatients++;
        } else {
            System.out.println("Maksymalna liczba pacjentów - " + maxPatientsNumber + " osiągnięta");
            System.out.println("Nie można dodać więcej pacjentów");
        }
    }

    public void printPatients() {
        for (int i = 0; i < regPatients; i++) {
            System.out.print("Pacjent " + (i + 1)+ ": ");
            patients[i].printPatient();
        }
    }
}