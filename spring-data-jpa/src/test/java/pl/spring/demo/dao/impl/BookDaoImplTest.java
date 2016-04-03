package pl.spring.demo.dao.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.spring.demo.dao.BookDao;
import pl.spring.demo.entity.Book;
import pl.spring.demo.service.impl.AbstractDatabaseTest;
import pl.spring.demo.to.BookSearchCriteriaTo;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="CommonDaoTest-context.xml")
public class BookDaoImplTest extends AbstractDatabaseTest{
	@Autowired
    private BookDao bookDao;

    @Test
    public void shouldFindAllBooks() {
        // when
        List<Book> allBooks = bookDao.findAll();
        // then
        assertThat(allBooks.size()).isEqualTo(8);
    }

    @Test
    public void shouldFindBooksByTitle() {

        // given
        BookSearchCriteriaTo bookSearchCriteria = new BookSearchCriteriaTo();
        String title = "Nie mów nikomu";
        bookSearchCriteria.setTitle(title);
        // when
        List<Book> books = bookDao.findBooks(bookSearchCriteria);
        // then
        Assert.assertEquals(1, books.size());
        Book book = books.iterator().next();
        assertThat(book.getTitle()).isEqualTo(title);
    }
}
