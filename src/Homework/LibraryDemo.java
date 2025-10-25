package Homework;

import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for PRINT ALL BOOKS");
            System.out.println("Please input 3 for SEARCH BOOK BY TITLE");
            System.out.println("Please input 4 for DELETE BOOK BY ID");
            System.out.println("Please input 5 for SEARCH BOOK BY PRICE RANGE");

            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;

                case "1":
                    System.out.println("Please input book's title:");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Please input book's author name:");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input book's price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    Book book = new Book(bookTitle, authorName, price);
                    bookStorage.add(book);
                    System.out.println("Book added successfully!");
                    break;

                case "2":
                    bookStorage.print();
                    break;

                case "3":
                    System.out.println("Please input keyword to search by title:");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;

                case "4":
                    System.out.println("Please input book ID to delete:");
                    int id = Integer.parseInt(scanner.nextLine());
                    bookStorage.deleteById(id);
                    break;
                case "5":
                    System.out.println("Please input minimum price:");
                    double minPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input maximum price:");
                    double maxPrice = Double.parseDouble(scanner.nextLine());
                    bookStorage.searchByPriceRange(minPrice, maxPrice);
                    break;


                default:
                    System.out.println("Invalid command !");
            }
        }
    }
}


