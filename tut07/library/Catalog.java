package PR2.tut07.library;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String creationDate;
    private int totalNumberOfBooks;
    private List<String> bookTitles = new ArrayList<String>();
    private List<String> authors = new ArrayList<String>();
    private List<String> subjects = new ArrayList<String>();
    private List<Format> formats = new ArrayList<Format>();
    //Constructor
    public Catalog(String creationDate, int totalNumberOfBooks) throws Exception {
        if (!this.isValidCreationDate(creationDate)) throw new Exception("Invalid creation date!");
        this.creationDate = creationDate;

        if (!this.isValidTotalNumberOfBooks(totalNumberOfBooks)) throw new Exception("Invalid number of books!");
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    //getter & setter
    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) throws Exception{
        if (!this.isValidCreationDate(creationDate)) throw new Exception("Invalid creation date!");
        this.creationDate = creationDate;
    }

    public int getTotalNumberOfBooks() {
        return this.totalNumberOfBooks;
    }

    public void setTotalNumberOfBooks(int totalNumberOfBooks) throws Exception{
        if (!this.isValidTotalNumberOfBooks(totalNumberOfBooks)) throw new Exception("Invalid number of books!");
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    public List<String> getBookTitles() {
        return this.bookTitles;
    }

    public void setBookTitles(List<String> bookTitles) {
        this.bookTitles = bookTitles;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Format> getFormats() {
        return this.formats;
    }

    public void setFormats(List<Format> formats) {
        this.formats = formats;
    }

    //validator
    public boolean isValidCreationDate(String creationDate) {
        return creationDate.trim() != null && creationDate.trim() != "" && creationDate.trim() != " " && creationDate.trim().length() <= 10;
    }

    public boolean isValidTotalNumberOfBooks(int totalNumberOfBooks) {
        return totalNumberOfBooks >= 0;
    }

    @Override
    public String toString() {
        return "Catalog[" +
                "creationDate=" + this.getCreationDate() +
                ",totalNumberOfBooks=" + this.getTotalNumberOfBooks() +
                ']';
    }
}
