import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private static final long serialVersionUID = 2L;
    private double salary;


    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", wypłata: " + salary + "zł";
    }
}
