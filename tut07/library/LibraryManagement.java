package PR2.tut07.library;
import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) throws Exception{
        // Test Account class
        Account memberAccount = new Account(1, "password123", AccountStatus.Active, AccountType.Member);
        System.out.println(memberAccount);

        // Test Book class
        List<String> authors = new ArrayList<>();
        authors.add("Author 1");
        authors.add("Author 2");
        Book book = new Book("978-3-16-148410-0", "Book Title", "Book Subject", "English", 200);
        System.out.println(book);

        // Test BookItem class
        BookItem bookItem = new BookItem("123456789", 29.99, Format.Paperback, BookStatus.Available, "2024-03-16", "2023-01-01");
        System.out.println(bookItem);

        // Test Catalog class
        List<String> bookTitles = new ArrayList<>();
        bookTitles.add("Book 1");
        bookTitles.add("Book 2");
        List<Format> formats = new ArrayList<>();
        formats.add(Format.Paperback);
        formats.add(Format.Hardcover);
        Catalog catalog = new Catalog("2024-03-16", 10);
        catalog.setBookTitles(bookTitles);
        catalog.setFormats(formats);
        System.out.println(catalog);

        // Test BookLending class
        Account librarianAccount = new Account(2, "librarianpass", AccountStatus.Active, AccountType.Librarian);
        List<BookItem> bookItems = new ArrayList<>();
        bookItems.add(bookItem);
        BookLending bookLending = new BookLending("2024-03-16", librarianAccount, "2024-03-30", "2024-04-15", BookLendingStatus.OnLoan);
        bookLending.setBookItems(bookItems);
        System.out.println(bookLending);
    }

}
