package pl.spring.demo.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import pl.spring.demo.dao.LibraryDao;
import pl.spring.demo.entity.Library;

@Repository
public class LibraryDaoImpl extends AbstractDao<Library, Long> implements LibraryDao{

	@Override
	public List<Library> findByName(String name) {
        // TODO queries: Implement query
        return Collections.emptyList();
    }

	@Override
	public List<Library> findLibrariesByAuthor(String lastName) {
        // TODO queries: Implement query
        return Collections.emptyList();
	}
}
