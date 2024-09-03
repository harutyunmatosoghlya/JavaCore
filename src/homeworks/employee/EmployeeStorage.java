package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (employees.length == size) {
            extendsStorage();
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employee.getEmployeeID())) {
                System.out.println("this ID already exists");
                return;
            }
        }
        employees[size++] = employee;
    }

    private void extendsStorage() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchEmployeeById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchEmployeeByCompany(String company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().toUpperCase().contains(company.toUpperCase())) {
                System.out.println(employees[i]);
            }
        }
    }
}