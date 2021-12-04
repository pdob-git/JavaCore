import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {
    private static final long serialVersionUID = 3L;

    private transient final int MAX_EMPLOYEES = 3;
    private final String name = "Firma";
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int employeesNumber = 0;

    public Company() {
    }

    public int getMAX_EMPLOYEES() {
        return MAX_EMPLOYEES;
    }

    public void addEmployee(Employee employee) {
        if (employeesNumber < MAX_EMPLOYEES) {
            employees[employeesNumber] = employee;
            employeesNumber++;
        } else {
            System.out.println("Limit pracowników w firmie osiągnięty");

        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String result = null;

        stringBuilder.append("Nazwa Firmy: ").append(name).append("\n");
        for (int i = 0; i < employeesNumber; i++) {
            stringBuilder.append(employees[i].toString());
            stringBuilder.append("\n");
            result = stringBuilder.toString();
        }

        return result;

    }
}
