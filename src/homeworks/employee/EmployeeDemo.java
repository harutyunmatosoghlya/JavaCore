package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo implements CommandsEmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            CommandsEmployeeDemo.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT -> isRun = false;
                case ADD -> addEmployee();
                case PRINT -> employeeStorage.print();
                case SEARCH_ID -> searchById();
                case SEARCH_COMPANY -> searchByCompany();
            }
        }
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
        boolean check = true;
        if (!name.isEmpty()) {
            check = false;
            return name;
        }
        while (check) {
            System.out.print("Please input EMPLOYEE_NAME: ");
            name = scanner.nextLine();
            if (!name.isEmpty()) {
                check = false;
            }
        }
        return name;
    }

    private static String addSurName() {
        System.out.print("Please input EMPLOYEE_SURNAME: ");
        String surName = scanner.nextLine();
        boolean check = true;
        if (!surName.isEmpty()) {
            check = false;
            return surName;
        }
        while (check) {
            System.out.print("Please input EMPLOYEE_SURNAME: ");
            surName = scanner.nextLine();
            if (!surName.isEmpty()) {
                check = false;
            }
        }
        return surName;
    }

    private static String addId() {
        System.out.print("Please input EMPLOYEE_ID: ");
        String id = scanner.nextLine();
        while (employeeStorage.checkId(id)) {
            System.out.println("this ID already exists. Please input another ID");
            id = scanner.nextLine();
        }
        boolean check = true;
        if (!id.isEmpty()) {
            check = false;
            return id;
        }
        while (check) {
            System.out.print("Please input EMPLOYEE_ID: ");
            id = scanner.nextLine();
            if (!id.isEmpty()) {
                check = false;
            }
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
        boolean check = true;
        if (salary > 0) {
            check = false;
            return salary;
        }
        while (check) {
            System.out.print("Please input EMPLOYEE_SALARY: ");
            salary = Double.parseDouble(scanner.nextLine());
            if (salary > 0) {
                check = false;
            }
        }
        return salary;
    }

    private static String addCompany() {
        System.out.print("Please input EMPLOYEE_COMPANY: ");
        String company = scanner.nextLine();
        boolean check = true;
        if (!company.isEmpty()) {
            check = false;
            return company;
        }
        while (check) {
            System.out.print("Please input EMPLOYEE_COMPANY: ");
            company = scanner.nextLine();
            if (!company.isEmpty()) {
                check = false;
            }
        }
        return company;
    }

    private static String addPosition() {
        System.out.print("Please input EMPLOYEE_POSITION: ");
        String position = scanner.nextLine();
        boolean check = true;
        if (!position.isEmpty()) {
            check = false;
            return position;
        }
        while (check) {
            System.out.print("Please input EMPLOYEE_POSITION: ");
            position = scanner.nextLine();
            if (!position.isEmpty()) {
                check = false;
            }
        }
        return position;
    }
}