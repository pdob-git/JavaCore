import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class ObjectReader {

    public ObjectReader() {
    }

    public Company readCompany() {
        String fileName = "Company.obj";
        Company company = null;

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            company = (Company) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }


        return company;
    }
}