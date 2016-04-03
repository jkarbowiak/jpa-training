package pl.spring.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book implements Serializable {

    public static String TITLE_PROPERTY = "title";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "BOOK_AUTHOR",
            joinColumns = {@JoinColumn(name = "BOOK_ID", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "AUTHOR_ID", nullable = false, updatable = false)})
    private Set<Author> authors = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
    private BookReview bookReview;

    @ManyToOne
	@JoinColumn(name="LIBRARY_ID", nullable=true)
    private Library library;
    
    @Version
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
