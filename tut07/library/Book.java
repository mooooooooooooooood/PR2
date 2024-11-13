package PR2.tut07.library;

import PR2.tut07.lms.Student;
import sun.nio.cs.ext.IBM037;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String ISBN; //International Standard Book Number
    private String title;
    private String subject;
    private List<String> authors = new ArrayList<String>();
    private List<String> publishers = new ArrayList<String>();
    private String language;
    private int pageNumber;
    //Constructor
    public Book (String IBSN, String title, String subject, String language, int pageNumber) throws Exception{
        this.ISBN = IBSN;

        if (!this.isValidTitle(title)) throw new Exception("Invalid title!");
        this.title = title;

        if (!this.isValidSubject(subject)) throw new Exception("Invalid subject!");
        this.subject = subject;

        if (!this.isValidLanguage(language)) throw new Exception("Invalid language!");
        this.language = language;

        if (!this.isValidPageNumber(pageNumber)) throw new Exception("Invalid number of pages!");
        this.pageNumber = pageNumber;
    }

    //getter & setter
    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) throws Exception {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) throws Exception{
        if (!this.isValidTitle(title)) throw new Exception("Invalid title!");
        this.title = title;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) throws Exception {
        if (!this.isValidSubject(subject)) throw new Exception("Invalid subject!");
        this.subject = subject;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getPublishers() {
        return this.publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) throws Exception {
        if (!this.isValidLanguage(language)) throw new Exception("Invalid language!");
        this.language = language;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) throws Exception{
        if (!this.isValidPageNumber(pageNumber)) throw new Exception("Invalid number of pages!");
        this.pageNumber = pageNumber;
    }

    //validator
    public boolean isValidTitle(String title) {
        return title != null && title.trim() != " " && title.trim() != "";
    }

    public boolean isValidSubject(String subject) {
        return subject != null && subject.trim() != " " && subject.trim() != "";
    }

    public boolean isValidLanguage(String language) {
        return language != null && language.trim() != " " && language.trim() != "";
    }

    public boolean isValidPageNumber(int pages) {
        return pages > 0;
    }

    @Override
    public String toString() {
        return "Book[ISBN=" + this.getISBN() + ",title=" + this.getTitle() + ",subject=" + this.getSubject() +",language=" + this.getLanguage() + ",number of pages=" + this.getPageNumber() + "]";
    }
}
