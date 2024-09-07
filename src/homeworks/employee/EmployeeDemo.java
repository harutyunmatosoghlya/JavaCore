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
        String name = scanner.nextLine();
        return check(name);
    }

    private static String addSurName() {
        System.out.print("Please input EMPLOYEE_SURNAME: ");
        String surName = scanner.nextLine();
        return check(surName);
    }

    private static String addId() {
        System.out.print("Please input EMPLOYEE_ID: ");
        String id = scanner.nextLine();
        while (employeeStorage.checkId(check(id))) {
            System.out.print("This ID already exists. Please input another ID: ");
            id = scanner.nextLine();
        }
        return id;
    }

    private static double addSalary() {
        System.out.print("Please input EMPLOYEE_SALARY: ");
        double salary = 0;
        boolean checkId = true;
        do {
            try {
                salary = Double.parseDouble(scanner.nextLine());
                checkId = false;
            } catch (NumberFormatException e) {
                System.out.println("input only number");
            }
        } while (checkId);
        return check(salary);
    }

    private static String addCompany() {
        System.out.print("Please input EMPLOYEE_COMPANY: ");
        String company = scanner.nextLine();
        return check(company);
    }

    private static String addPosition() {
        System.out.print("Please input EMPLOYEE_POSITION: ");
        String position = scanner.nextLine();
        return check(position);
    }

    private static String check(String check) {
        boolean right = true;
        if (!check.isEmpty()) {
            return check;
        }
        while (right) {
            System.out.print("enter again: ");
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
            System.out.print("enter a positive number: ");
            check = Double.parseDouble(scanner.nextLine());
            if (check > 0) {
                right = false;
            }
        }
        return check;
    }
}