package homeworks.employee;

public class EmployeeDemo implements CommandsEmployeeDemo {
    public static void main() {
        boolean isRun = true;
        while (isRun) {
            CommandsEmployeeDemo.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT -> isRun = exit();
                case ADD -> addEmployee();
                case PRINT -> employeeStorage.print();
                case SEARCH_ID -> searchById();
                case SEARCH_COMPANY -> searchByCompany();
            }
        }
    }

    private static boolean exit() {
        System.out.print("The application has shut down.");
        return false;
    }

    private static void searchByCompany() {
        System.out.print("Please input COMPANY-KEYWORD: ");
        String keywordCompany = scanner.nextLine();
        employeeStorage.searchEmployeeByCompany(keywordCompany);
    }

    private static void searchById() {
        System.out.print("Please input ID-KEYWORD: ");
        String keywordID = scanner.nextLine();
        employeeStorage.searchEmployeeById(keywordID);
    }

    private static void addEmployee() {
        Employee employee = new Employee(addName(), addSurName(), addId(), addSalary(), addCompany(), addPosition());
        employeeStorage.add(employee);
        System.out.println("employee added!");
    }

    private static String addName() {
        System.out.print("Please input EMPLOYEE_NAME: ");
        return check(scanner.nextLine());
    }

    private static String addSurName() {
        System.out.print("Please input EMPLOYEE_SURNAME: ");
        return check(scanner.nextLine());
    }

    private static String addId() {
        System.out.print("Please input EMPLOYEE_ID: ");
        String id = scanner.nextLine();
        id = check(id);
        while (employeeStorage.checkId(id)) {
            System.out.print("Such an ID already exists. Please input new ID: ");
            id = check(scanner.nextLine());
        }
        return id;
    }

    private static double addSalary() {
        System.out.print("Please input EMPLOYEE_SALARY: ");
        double salary = 0;
        boolean check = true;
        do {
            try {
                salary = check(Double.parseDouble(scanner.nextLine()));
                check = false;
            } catch (NumberFormatException e) {
                System.out.print("Please input ONLY_NUMBER: ");
            }
        } while (check);
        return salary;
    }

    private static String addCompany() {
        System.out.print("Please input EMPLOYEE_COMPANY: ");
        return check(scanner.nextLine());
    }

    private static String addPosition() {
        System.out.print("Please input EMPLOYEE_POSITION: ");
        return check(scanner.nextLine());
    }

    private static String check(String check) {
        boolean right = true;
        if (!check.isEmpty()) {
            return check;
        }
        while (right) {
            System.out.print("You haven't entered anything, try AGAIN: ");
            check = scanner.nextLine();
            if (!check.isEmpty()) {
                right = false;
            }
        }
        return check;
    }

    private static double check(double check) {
        boolean right = true;
        if (check > 0) {
            return check;
        }
        while (right) {
            System.out.print("Please input POSITIVE_NUMBER: ");
            check = Double.parseDouble(scanner.nextLine());
            if (check > 0) {
                right = false;
            }
        }
        return check;
    }
}