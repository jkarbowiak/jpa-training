package pl.spring.demo.dao.impl;

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

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
        Root<Book> from = criteriaQuery.from(Book.class);
        CriteriaQuery<Book> select = criteriaQuery.select(from);

        Expression<String> literal = criteriaBuilder.upper(criteriaBuilder.literal(bookSearchCriteria.getTitle()));
        Predicate predicate = criteriaBuilder.equal(criteriaBuilder.upper(from.get(Book.TITLE_PROPERTY)), literal);
        criteriaQuery.where(predicate);

        TypedQuery<Book> typedQuery = entityManager.createQuery(select);
        return typedQuery.getResultList();
    }
}
