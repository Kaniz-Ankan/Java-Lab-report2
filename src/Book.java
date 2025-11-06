import java.util.Scanner;

public class Book {
    String title;
    String author;
    int year;
    static String genre;
    static int totalBooks = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        totalBooks++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

    public static void displayTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter genre: ");
        genre = scanner.nextLine();


        System.out.println("\nEnter details for Book 1:");
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = Integer.parseInt(scanner.nextLine());
        Book book1 = new Book(title1, author1, year1);


        System.out.println("\nEnter details for Book 2:");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Year: ");
        int year2 = Integer.parseInt(scanner.nextLine());
        Book book2 = new Book(title2, author2, year2);

        System.out.println("\nEnter details for Book 3:");
        System.out.print("Title: ");
        String title3 = scanner.nextLine();
        System.out.print("Author: ");
        String author3 = scanner.nextLine();
        System.out.print("Year: ");
        int year3 = Integer.parseInt(scanner.nextLine());
        Book book3 = new Book(title3, author3, year3);


        System.out.println("\n--- Book Details ---");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        displayTotalBooks();
    }
}
