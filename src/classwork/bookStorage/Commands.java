package classwork.bookStorage;

public interface Commands {
    String EXIT = "0";
    String ADD = "1";
    String PRINT = "2";
    String SEARCH = "3";
    String DELETE = "5";
    String UPDATE = "4";
    String SEARCH_ID = "1";
    String SEARCH_TITLE = "2";
    String SEARCH_AUTHOR_NAME = "3";
    String SEARCH_PRICE = "4";
    String UPDATE_TITLE = "1";
    String UPDATE_AUTHOR_NAME = "2";
    String UPDATE_PRICE = "3";
    String UPDATE_QUANTITY = "4";
    String UPDATE_ALL = "5";

    static void printUpdateCommands() {
        System.out.println("Please input '" + UPDATE_TITLE + "' for update book title.");
        System.out.println("Please input '" + UPDATE_AUTHOR_NAME + "' for update book author name.");
        System.out.println("Please input '" + UPDATE_PRICE + "' for update book price.");
        System.out.println("Please input '" + UPDATE_QUANTITY + "' for update book quantity.");
        System.out.println("Please input '" + UPDATE_ALL + "' for update all book.");
    }

    static void printSearchCommands() {
        System.out.println("Please input '" + SEARCH_ID + "' for search book by book ID.");
        System.out.println("Please input '" + SEARCH_TITLE + "' for search book by book title.");
        System.out.println("Please input '" + SEARCH_AUTHOR_NAME + "' for search book by book author name.");
        System.out.println("Please input '" + SEARCH_PRICE + "' for search book by book price range.");
    }

    static void printCommands() {
        System.out.println("Please input '" + EXIT + "' for exit.");
        System.out.println("Please input '" + ADD + "' for add.");
        System.out.println("Please input '" + PRINT + "' for print all books.");
        System.out.println("Please input '" + SEARCH + "' for search book.");
        System.out.println("Please input '" + UPDATE + "' for update book.");
        System.out.println("Please input '" + DELETE + "' for deleted book.");
    }
}