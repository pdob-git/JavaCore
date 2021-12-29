package my;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Employee> employees = new HashMap<>();



    public void addEmployee(Employee employee){
        String key = employee.getFirstName() + " " + employee.getLastName();
        employees.put(key,employee);
    }

    public Employee getEmployee(String firstName, String lastName){
        String key = firstName + " " + lastName;
        return employees.get(key);
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }
}
