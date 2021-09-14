public class VatCalculator {
    public static void main(String[] args) {
        double netto = 100;
        double vatRate = 0.23;
        double vat = vatRate * netto;
        double brutto = netto + vat;
        System.out.println("Netto = " + netto);
        System.out.println("Vat = " + vat);
        System.out.println("Cena brutto = " + brutto);

    }
}
