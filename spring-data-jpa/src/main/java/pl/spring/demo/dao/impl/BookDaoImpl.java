package pl.spring.demo.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import org.springframework.stereotype.Repository;

import pl.spring.demo.dao.BookDao;
import pl.spring.demo.entity.Book;
import pl.spring.demo.to.BookSearchCriteriaTo;

@Repository
public class BookDaoImpl extends AbstractDao<Book, Long> implements BookDao {

    @Override
    public List<Book> findBooks(BookSearchCriteriaTo bookSearchCriteria) {
        // TODO queries: Implement query
        return Collections.emptyList();
    }
}
