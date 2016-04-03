package pl.spring.demo.to;

import java.util.ArrayList;
import java.util.List;

public class LibraryTo {
    private Long id;
    private String name;
    private List<BookTo> books = new ArrayList<>();
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BookTo> getBooks() {
		return books;
	}
	public void setBooks(List<BookTo> books) {
		this.books = books;
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
		LibraryTo other = (LibraryTo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
