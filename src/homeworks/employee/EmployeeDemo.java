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
        System.out.print("Please input EMPLOYEE_NAME: ");
        String name = scanner.nextLine();
        System.out.print("Please input EMPLOYEE_SURNAME: ");
        String surName = scanner.nextLine();
        System.out.print("Please input EMPLOYEE_ID: ");
        String id = scanner.nextLine();
        System.out.print("Please input EMPLOYEE_SALARY: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input EMPLOYEE_COMPANY: ");
        String company = scanner.nextLine();
        System.out.print("Please input EMPLOYEE_POSITION: ");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surName, id, salary, company, position);
        employeeStorage.add(employee);
        System.out.println("Employee added!");
    }
}