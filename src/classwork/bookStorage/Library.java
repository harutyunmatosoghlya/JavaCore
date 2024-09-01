package classwork.bookStorage;

import java.util.Scanner;

public class Library implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("A001", "Book1", "Author1", 50, 5));
        bookStorage.add(new Book("A002", "Book2", "Author2", 100, 10));
        bookStorage.add(new Book("A003", "Book3", "Author3", 150, 15));
        bookStorage.add(new Book("A004", "Book4", "Author4", 200, 20));
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
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
                    searchBook();
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

    private static void searchBook() {
        Commands.printSearchCommands();
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
    }

    private static void deleteBook() {
        bookStorage.print();
        System.out.print("choose BOOK-ID: ");
        String id = scanner.nextLine();
        bookStorage.deleteBook(id);
    }

    private static void updateBook() {
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookByID(bookId);
        if (bookById != null) {
            Commands.printUpdateCommands();
            String updateCommands = scanner.nextLine();
            switch (updateCommands) {
                case UPDATE_TITLE:
                    updateBookTitle(bookById);
                    break;
                case UPDATE_AUTHOR_NAME:
                    updateBookAuthorName(bookById);
                    break;
                case UPDATE_PRICE:
                    updateBookPrice(bookById);
                    break;
                case UPDATE_QUANTITY:
                    updateBookQuantity(bookById);
                    break;
                case UPDATE_ALL:
                    updateBookAll(bookById);
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void updateBookQuantity(Book bookById) {
        System.out.print("Please input book QUANTITY: ");
        String quantityStr = scanner.nextLine();
        if (quantityStr != null && !quantityStr.isEmpty()) {
            bookById.setQuantity(Integer.parseInt(quantityStr));
        }
    }

    private static void updateBookPrice(Book bookById) {
        System.out.print("Please input book PRICE: ");
        String priceStr = scanner.nextLine();
        if (priceStr != null && !priceStr.isEmpty()) {
            bookById.setPrice(Double.parseDouble(priceStr));
        }
    }

    private static void updateBookAuthorName(Book bookById) {
        System.out.print("Please input book AUTHOR-NAME: ");
        String authorName = scanner.nextLine();
        if (authorName != null && !authorName.isEmpty()) {
            bookById.setAuthorName(authorName);
        }
    }

    private static void updateBookTitle(Book bookById) {
        System.out.print("Please input book TITLE: ");
        String title = scanner.nextLine();
        if (title != null && !title.isEmpty()) {
            bookById.setTitle(title);
        }
    }

    private static void updateBookAll(Book bookById) {
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

    private static void searchBookByPrice() {
        System.out.print("Please input MAXIMUM-MINIMUM PRICE: ");
        String priceStr = scanner.nextLine();
        String[] priceArray = priceStr.split("-");
        double priceMax = Double.parseDouble(priceArray[0]);
        double priceMin = Double.parseDouble(priceArray[1]);
        if (priceArray.length == 2) {
            bookStorage.searchBookByPrice(priceMax, priceMin);
        }
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
        System.out.println("Book added!");
    }
}