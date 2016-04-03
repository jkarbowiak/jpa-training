package pl.spring.demo.to;

import java.util.ArrayList;
import java.util.List;

public class BookTo {
    private Long id;
    private String title;
    private LibraryTo libraryTo;
    private long version;

    private List<AuthorTo> authors = new ArrayList<>();

    public BookTo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public List<AuthorTo> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorTo> authors) {
        this.authors = authors;
    }

	public LibraryTo getLibraryTo() {
		return libraryTo;
	}

	public void setLibraryId(LibraryTo libraryTo) {
		this.libraryTo = libraryTo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookTo other = (BookTo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	

	
}
