package classwork.bookStorage;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input '0' for exit.");
            System.out.println("Please input '1' for add.");
            System.out.println("Please input '2' for print all books.");
            System.out.println("Please input '3' for search book.");
            System.out.println("Please input '4' for deleted book.");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    System.out.print("The application has shut down.");
                    isRun = false;
                    break;
                case "1":
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
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input '1' for search book by book ID.");
                    System.out.println("Please input '2' for search book by book title.");
                    System.out.println("Please input '3' for search book by book author name.");
                    System.out.println("Please input '4' for search book by book price.");
                    String search = scanner.nextLine();
                    switch (search){
                        case "1":
                            System.out.print("Please input ID-KEYWORD: ");
                            String keywordID = scanner.nextLine();
                            bookStorage.searchBookByID(keywordID);
                            break;
                        case "2":
                            System.out.print("Please input TITLE-KEYWORD: ");
                            String keywordTitle = scanner.nextLine();
                            bookStorage.searchBookByTitle(keywordTitle);
                            break;
                        case "3":
                            System.out.print("Please input AUTHOR-NAME-KEYWORD: ");
                            String keywordAuthorName = scanner.nextLine();
                            bookStorage.searchBookByAuthorName(keywordAuthorName);
                            break;
                        case "4":
                            System.out.print("Please input PRICE: ");
                            double keywordPrice = Double.parseDouble(scanner.nextLine());
                            bookStorage.searchBookByPrice(keywordPrice);
                            break;
                        default:
                            System.out.println("Wrong command");
                    }
                    break;
                case "4":
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
}