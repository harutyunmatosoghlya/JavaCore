package classwork.bookStorage;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookSrorage bookSrorage = new BookSrorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input '0' for exit.");
            System.out.println("Please input '1' for add.");
            System.out.println("Please input '2' for print all books.");
            System.out.println("Please input '3' for search book by book ID.");
            System.out.println("Please input '4' for search book by book title.");
            System.out.println("Please input '5' for search book by book author name.");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
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
                    bookSrorage.add(book);
                    System.out.println("Book added!");
                    break;
                case "2":
                    bookSrorage.print();
                    break;
                case "3":
                    System.out.print("Please input ID-KEYWORD: ");
                    String keywordID = scanner.nextLine();
                    bookSrorage.searchBookByID(keywordID);
                    break;
                case "4":
                    System.out.print("Please input TITLE-KEYWORD: ");
                    String keywordTitle = scanner.nextLine();
                    bookSrorage.searchBookByTitle(keywordTitle);
                    break;
                case "5":
                    System.out.print("Please input AUTHOR-NAME-KEYWORD: ");
                    String keywordAuthorName = scanner.nextLine();
                    bookSrorage.searchBookByAuthorName(keywordAuthorName);
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }
}
