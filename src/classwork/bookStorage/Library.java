package classwork.bookStorage;

import java.util.Scanner;

public class Library {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static final String EXIT = "0";
    private static final String ADD = "1";
    private static final String PRINT = "2";
    private static final String SEARCH = "3";
    private static final String DELETE = "5";
    private static final String UPDATE = "4";

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.out.print("The application has shut down.");
                    isRun = false;
                    break;
                case ADD:
                    addBook();
                    break;
                case PRINT:
                    bookStorage.print();
                    break;
                case SEARCH:
                    printSearchCommands();
                    String search = scanner.nextLine();
                    switch (search) {
                        case "1":
                            searchBookByID();
                            break;
                        case "2":
                            searchBookByTitle();
                            break;
                        case "3":
                            searchBookByAuthorName();
                            break;
                        case "4":
                            searchBookByPrice();
                            break;
                        default:
                            System.out.println("Wrong command");
                    }
                    break;
                case UPDATE:
                    updateBook();
                    break;
                case DELETE:
                    bookStorage.print();
                    System.out.print("choose BOOK-NUMBER: ");
                    int choose = Integer.parseInt(scanner.nextLine());
                    choose -= 1;
                    bookStorage.deleteBook(choose);
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void updateBook() {
        bookStorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookByID(bookId);
        if (bookById != null) {
            System.out.print("Please input book TITLE: ");
            String title = scanner.nextLine();
            System.out.print("Please input book AUTHOR-NAME: ");
            String authorName = scanner.nextLine();
            System.out.print("Please input book PRICE: ");
            String priceStr = scanner.nextLine();
            if (title != null && !title.isEmpty()) {
                bookById.setTitle(title);
            }
            if (authorName != null && !authorName.isEmpty()) {
                bookById.setAuthorName(authorName);
            }
            if (priceStr != null && !priceStr.isEmpty()) {
                bookById.setPrice(Double.parseDouble(priceStr));
            }
        }
    }

    private static void searchBookByPrice() {
        System.out.print("Please input PRICE: ");
        double keywordPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.searchBookByPrice(keywordPrice);
    }

    private static void searchBookByAuthorName() {
        System.out.print("Please input AUTHOR-NAME-KEYWORD: ");
        String keywordAuthorName = scanner.nextLine();
        bookStorage.searchBookByAuthorName(keywordAuthorName);
    }

    private static void searchBookByTitle() {
        System.out.print("Please input TITLE-KEYWORD: ");
        String keywordTitle = scanner.nextLine();
        bookStorage.searchBookByTitle(keywordTitle);
    }

    private static void searchBookByID() {
        System.out.print("Please input ID-KEYWORD: ");
        String keywordID = scanner.nextLine();
        bookStorage.searchBookByID(keywordID);
    }

    private static void addBook() {
        System.out.print("Please input book ID: ");
        String id = scanner.nextLine();
        System.out.print("Please input book TITLE: ");
        String title = scanner.nextLine();
        System.out.print("Please input book AUTHOR-NAME: ");
        String authorName = scanner.nextLine();
        System.out.print("Please input book PRICE: ");
        double price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(id, title, authorName, price);
        bookStorage.add(book);
    }

    private static void printSearchCommands() {
        System.out.println("Please input '1' for search book by book ID.");
        System.out.println("Please input '2' for search book by book title.");
        System.out.println("Please input '3' for search book by book author name.");
        System.out.println("Please input '4' for search book by book price.");
    }

    private static void printCommands() {
        System.out.println("Please input '" + EXIT + "' for exit.");
        System.out.println("Please input '" + ADD + "' for add.");
        System.out.println("Please input '" + PRINT + "' for print all books.");
        System.out.println("Please input '" + SEARCH + "' for search book.");
        System.out.println("Please input '" + UPDATE + "' for update book.");
        System.out.println("Please input '" + DELETE + "' for deleted book.");
    }
}