package Homework;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No books in library!");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + i + " | " + books[i]);
        }
    }

    public void search(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("ID: " + i + " | " + books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with title containing: " + keyword);
        }
    }

    public void deleteById(int id) {
        if (id < 0 || id >= size) {
            System.out.println("No book with such ID!");
            return;
        }
        for (int i = id; i < size - 1; i++) {
            books[i] = books[i + 1];
        }
        size--;
        System.out.println("Book deleted successfully!");
    }

    public void searchByPriceRange(double minPrice, double maxPrice) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                System.out.println("ID: " + i + " | " + books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in price Range " + minPrice + " - " + maxPrice);
        }
    }

}
