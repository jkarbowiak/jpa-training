package pl.spring.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Book implements Serializable {

    public static String TITLE_PROPERTY = "title";

    private Long id;

    private String title;

    private Set<Author> authors = new HashSet<>();

    private BookReview bookReview;

    private Library library;
    
    private long version;

    // for hibernate
    protected Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(Long id, String title) {
        this(title);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public BookReview getBookReview() {
        return bookReview;
    }

    public void setBookReview(BookReview bookReview) {
        if (bookReview != null) {
            bookReview.setBook(this);
        }
        this.bookReview = bookReview;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
}
