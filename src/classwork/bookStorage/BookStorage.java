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
                int quantity = books[i].getQuantity() + book.getQuantity();
                books[i].setQuantity(quantity);
                return;
            }
        }
        books[size++] = book;
        System.out.println("Book added!");
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
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                for (int j = i + 1; j < size; j++) {
                    books[j - 1] = books[j];
                }
                size--;
            }
        }
    }

    public void searchBookByPrice(double priceMax, double priceMin) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() <= priceMax && books[i].getPrice() >= priceMin) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByID(String id) {
        for (int i = 0; i < size; i++)
            if (books[i].getId().equals(id)) {
                return books[i];
            }
        return null;
    }
}