package PR2.tut07.library;

import java.util.ArrayList;
import java.util.List;

public class BookLending {
    private String creationDate;
    private Account account;
    private List<BookItem> bookItems = new ArrayList<BookItem>();
    private String dueDate;
    private String returnDate;
    private BookLendingStatus status;
    //Constructor
    public BookLending(String creationDate, Account account, String dueDate, String returnDate, BookLendingStatus status) throws Exception {
        if (!this.isValidCreationDate(creationDate)) throw new Exception("Invalid creation date!");
        this.creationDate = creationDate;
        this.account = account;

        if (!this.isValidDueDate(dueDate)) throw new Exception("Invalid due date!");
        this.dueDate = dueDate;

        if (!this.isValidReturnDate(returnDate)) throw new Exception("Invalid return date!");
        this.returnDate = returnDate;
        this.status = status;
    }

    //getter setter

    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) throws Exception {
        if (!this.isValidCreationDate(creationDate)) throw new Exception("Invalid creation date!");
        this.creationDate = creationDate;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<BookItem> getBookItems() {
        return this.bookItems;
    }

    public void setBookItems(List<BookItem> bookItems) {
        this.bookItems = bookItems;
    }

    public BookLendingStatus getStatus() {
        return this.status;
    }

    public void setStatus(BookLendingStatus status) {
        this.status = status;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) throws Exception{
        if (!this.isValidDueDate(dueDate)) throw new Exception("Invalid due date!");
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(String returnDate) throws Exception{
        if (!this.isValidReturnDate(returnDate)) throw new Exception("Invalid return date!");
        this.returnDate = returnDate;
    }

    //validator
    public boolean isValidCreationDate(String creationDate) {
        return (creationDate != null) && (creationDate.trim().length() <= 10);
    }

    public boolean isValidDueDate (String dueDate) {
        return (dueDate != null) && (dueDate.trim().length() <= 10);
    }

    public boolean isValidReturnDate (String returnDate) {
        return (returnDate != null) && (returnDate.trim().length() <= 10);
    }

    @Override
    public String toString() {
        return "BookLending[" +
                "creationDate='" + this.getCreationDate() +
                ",account=" + this.getAccount() +
                ",dueDate='" + this.getDueDate() +
                ",returnDate='" + this.getReturnDate() +
                ",status=" + this.getStatus() +
                ']';
    }
}
