package page;
enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    boolean checkEmployeeEmployment(Employee employee) {
        return this == employee.getEmployment();
    }
}