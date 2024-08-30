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
    private static final String SEARCH_ID = "1";
    private static final String SEARCH_TITLE = "2";
    private static final String SEARCH_AUTHOR_NAME = "3";
    private static final String SEARCH_PRICE = "4";

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
                        case SEARCH_ID:
                            searchBookByID();
                            break;
                        case SEARCH_TITLE:
                            searchBookByTitle();
                            break;
                        case SEARCH_AUTHOR_NAME:
                            searchBookByAuthorName();
                            break;
                        case SEARCH_PRICE:
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
                    deleteBook();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void deleteBook() {
        bookStorage.print();
        System.out.print("choose BOOK-ID: ");
        String id = scanner.nextLine();
        bookStorage.deleteBook(id);
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
            System.out.print("Please input book QUANTITY: ");
            String quantityStr = scanner.nextLine();
            if (title != null && !title.isEmpty()) {
                bookById.setTitle(title);
            }
            if (authorName != null && !authorName.isEmpty()) {
                bookById.setAuthorName(authorName);
            }
            if (priceStr != null && !priceStr.isEmpty()) {
                bookById.setPrice(Double.parseDouble(priceStr));
            }
            if (quantityStr != null && !quantityStr.isEmpty()) {
                bookById.setQuantity(Integer.parseInt(quantityStr));
            }
        }
    }

    private static void searchBookByPrice() {
        System.out.print("Please input MAXIMUM-PRICE: ");
        double priceMax = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input MINIMUM-PRICE: ");
        double priceMin = Double.parseDouble(scanner.nextLine());
        bookStorage.searchBookByPrice(priceMax, priceMin);
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
        System.out.print("Please input book QUANTITY: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Book book = new Book(id, title, authorName, price, quantity);
        bookStorage.add(book);
    }

    private static void printSearchCommands() {
        System.out.println("Please input '" + SEARCH_ID + "' for search book by book ID.");
        System.out.println("Please input '" + SEARCH_TITLE + "' for search book by book title.");
        System.out.println("Please input '" + SEARCH_AUTHOR_NAME + "' for search book by book author name.");
        System.out.println("Please input '" + SEARCH_PRICE + "' for search book by book price range.");
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