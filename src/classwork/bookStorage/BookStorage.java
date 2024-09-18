package classwork.bookStorage;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extendsStorage();
        }
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(book.getId())) {
                System.out.println("this ID already exists");
                return;
            }
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

    public void deleteBook(String id) {
        int index = getBookIndexById(id);
        if (index != -1) {
            for (int i = index + 1; i < size; i++) {
                books[i - 1] = books[i];
            }
            size--;
        }
    }

    private int getBookIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void searchBookByPrice(double priceMax, double priceMin) {
        double newMin = Math.min(priceMin, priceMax);
        double newMax = Math.max(priceMax, priceMin);
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() <= newMax && books[i].getPrice() >= newMin) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByID(String id) {
        for (int i = 0; i < size; i++)
            if (books[i].getId().equalsIgnoreCase(id)) {
                return books[i];
            }
        return null;
    }
}