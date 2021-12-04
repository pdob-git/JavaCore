import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectWriter {

    public ObjectWriter() {
    }

    public void saveCompany(Company company) {
        String fileName = "Company.obj";

        try(
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(company);
            System.out.println("Zapisano obiekt do pliku");

        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku " + fileName);
            e.printStackTrace();
        }
    }
}