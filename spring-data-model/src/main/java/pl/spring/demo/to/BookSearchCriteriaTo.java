package pl.spring.demo.to;

import com.google.common.base.Objects;

public class BookSearchCriteriaTo {

    private String title;
    private String author;
    private Boolean hasReview;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getHasReview() {
        return hasReview;
    }

    public void setHasReview(Boolean hasReview) {
        this.hasReview = hasReview;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookSearchCriteriaTo that = (BookSearchCriteriaTo) o;

        return Objects.equal(author, that.author)
                && Objects.equal(hasReview, that.hasReview)
                && Objects.equal(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author, hasReview, title);
    }
}
