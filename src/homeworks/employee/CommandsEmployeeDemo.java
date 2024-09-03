package homeworks.employee;

public interface CommandsEmployeeDemo {
    String EXIT = "0";
    String ADD = "1";
    String PRINT = "2";
    String SEARCH_ID = "3";
    String SEARCH_COMPANY = "4";

    static void printCommands() {
        System.out.println("Please input '" + EXIT + "' for exit.");
        System.out.println("Please input '" + ADD + "' for add employee.");
        System.out.println("Please input '" + PRINT + "' for print all employee.");
        System.out.println("Please input '" + SEARCH_ID + "' for search employee by employee ID.");
        System.out.println("Please input '" + SEARCH_COMPANY + "' for employee by company name.");
    }
}