package classwork.bookStorage;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extendsStorage();
        }
        books[size++] = book;
    }

    private void extendsStorage() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ": " + books[i]);
        }
    }

    public void searchBookByTitle(String keywordTitle) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toUpperCase().contains(keywordTitle.toUpperCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBookByID(String keywordID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().toUpperCase().contains(keywordID.toUpperCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBookByAuthorName(String keywordAuthorName) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthorName().toUpperCase().contains(keywordAuthorName.toUpperCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void deleteBook(int choose) {
        if (choose < size && choose >= 0) {
            for (int i = choose + 1; i < size; i++) {
                books[i - 1] = books[i];
            }
            size--;
        } else {
            System.out.println("Wrong index");
        }
    }

    public void searchBookByPrice(double keywordPrice) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() <= keywordPrice){
                System.out.println(books[i]);
            }
        }
    }
}