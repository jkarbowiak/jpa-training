package pl.spring.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.spring.demo.dao.BookDao;
import pl.spring.demo.entity.Book;
import pl.spring.demo.entity.BookReview;
import pl.spring.demo.mapper.BookMapper;
import pl.spring.demo.service.BookService;
import pl.spring.demo.to.BookSearchCriteriaTo;
import pl.spring.demo.to.BookTo;
import pl.spring.demo.to.NewBookTo;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;
    private final BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper, BookDao bookDao) {
        this.bookMapper = bookMapper;
        this.bookDao = bookDao;
    }

    @Override
    public BookTo findBookById(long bookId) {
        return bookMapper.convertToTransportObject(bookDao.find(bookId));
    }

    @Override
    public List<BookTo> findBooks(BookSearchCriteriaTo searchCriteria) {
        List<Book> books = bookDao.findBooks(searchCriteria);
        return new ArrayList<>(bookMapper.mapSourceCollection(books));
    }

    @Override
    public BookTo createBook(NewBookTo bookToSave) {
        Book bookEntity = bookMapper.mapNewBook(bookToSave);
        bookEntity = bookDao.save(bookEntity);
        return bookMapper.convertToTransportObject(bookEntity);
    }

    @Override
    public BookTo updateBook(BookTo bookTo) {
        Book bookEntity = bookMapper.convertToEntity(bookTo);
        Book savedBookEntity = bookDao.update(bookEntity);
        bookDao.flush();
        return bookMapper.convertToTransportObject(savedBookEntity);
    }

    @Override
    public String findBookReview(long bookId) {
        Book bookEntity = bookDao.find(bookId);
        if (bookEntity != null) {
            BookReview bookReview = bookEntity.getBookReview();
            if (bookReview != null) {
                return bookReview.getContent();
            }
        }
        return null;
    }

    @Override
    public void removeBookById(long bookIdToRemove) {
        bookDao.delete(bookIdToRemove);
    }
}
