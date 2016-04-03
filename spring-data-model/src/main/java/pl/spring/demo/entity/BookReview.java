package pl.spring.demo.entity;

import java.io.Serializable;

public class BookReview implements Serializable {

    private Long id;

    private String content;

    private Book book;

    // for hibernate
    protected BookReview() {
    }

    public BookReview(String content) {
        this.content = content;
    }

    public BookReview(Long id, String content) {
        this(content);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
