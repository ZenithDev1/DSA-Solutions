import java.util.*;
// Topic collection framework in java
class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ")";
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        // List of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));

        // Set of unique authors
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.author);
        }

        // Map genre to book list
        Map<String, List<Book>> genreMap = new HashMap<>();
        genreMap.put("Fantasy", new ArrayList<>());
        genreMap.put("Dystopian", new ArrayList<>());
        genreMap.put("Classic", new ArrayList<>());

        genreMap.get("Fantasy").add(books.get(0));
        genreMap.get("Dystopian").add(books.get(1));
        genreMap.get("Classic").add(books.get(2));
        genreMap.get("Dystopian").add(books.get(3));

        // Display all authors
        System.out.println("Authors in the library:");
        for (String author : authors) {
            System.out.println("- " + author);
        }

        // Display books by genre
        System.out.println("\nBooks by Genre:");
        for (String genre : genreMap.keySet()) {
            System.out.println(genre + ":");
            for (Book b : genreMap.get(genre)) {
                System.out.println("  " + b);
            }
        }

        // Sort books by title
        books.sort(Comparator.comparing(b -> b.title));
        System.out.println("\nBooks sorted by Title:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort books by year
        books.sort(Comparator.comparingInt(b -> b.year));
        System.out.println("\nBooks sorted by Year:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
