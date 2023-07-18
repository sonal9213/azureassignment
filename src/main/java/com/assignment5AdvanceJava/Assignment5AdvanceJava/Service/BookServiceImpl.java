package com.assignment5AdvanceJava.Assignment5AdvanceJava.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Dao.BooksDao;
import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Book;


@Service
public class BookServiceImpl implements BookService {
    
	@Autowired
	BooksDao bookDao;
	
	public BookServiceImpl(){
		
	}
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Book savedBook = bookDao.save(book);
		
		return savedBook;
	}
	@Override
	public Book deleteBook(Integer BookId) {
		// TODO Auto-generated method stub
		Book bookEntity=bookDao.getReferenceById(BookId.toString());
		bookDao.delete(bookEntity);
		
		return bookEntity;
	}
	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.save(book);
		return book;
	}

}
