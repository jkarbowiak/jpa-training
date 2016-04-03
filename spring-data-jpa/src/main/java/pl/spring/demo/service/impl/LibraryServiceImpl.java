package pl.spring.demo.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.spring.demo.dao.BookDao;
import pl.spring.demo.dao.LibraryDao;
import pl.spring.demo.entity.Book;
import pl.spring.demo.entity.Library;
import pl.spring.demo.mapper.LibraryMapper;
import pl.spring.demo.service.LibraryService;
import pl.spring.demo.to.LibraryTo;

@Service
public class LibraryServiceImpl implements LibraryService{

	private final LibraryDao libraryDao;
	private BookDao bookDao;
	private LibraryMapper libraryMapper;
	
	@Autowired
	public LibraryServiceImpl(LibraryDao libraryDao, LibraryMapper libraryMapper, BookDao bookDao) {
		this.libraryDao = libraryDao;
		this.libraryMapper = libraryMapper;
		this.bookDao = bookDao;
	}

	@Override
	public Collection<LibraryTo> findByName(String name) {
		List<Library> library = libraryDao.findByName(name);
		return libraryMapper.mapSourceCollection(library);
	}

	@Override
	public LibraryTo findLibraryById(long id) {
		Library library = libraryDao.find(id);
		return libraryMapper.convertToTransportObject(library);
	}

	@Override
	public LibraryTo createNewLibrary(LibraryTo libraryTo) {
		Library library = libraryMapper.convertToEntity(libraryTo);
		libraryDao.save(library);
		
		return libraryMapper.convertToTransportObject(library);
	}

	@Override
	public void changeLibraryName(long id, String newName) {
		Library library = libraryDao.find(id);
		library.setName(newName);
	}

	@Override
	public void removeLibrary(long id) {
		libraryDao.delete(id);
		
	}

	@Override
	public void addBookToLibrary(long libraryId, long bookId) {
		Library library = libraryDao.find(libraryId);
		Book book = bookDao.find(bookId);
		library.addBook(book);
	}

	@Override
	public Collection<LibraryTo> findLibrariesByAuthor(String lastName) {
		List<Library> allLibraries = libraryDao.findAll();
		List<Library> library = libraryDao.findLibrariesByAuthor(lastName);
		return libraryMapper.mapSourceCollection(library);
	}
}
