package com.assignment5AdvanceJava.Assignment5AdvanceJava.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Book;


public interface BookService {
	
	public List<Book> getBooks();
	
	public Book addBook(Book book);
	
	public Book deleteBook(Integer CourseId);
	
	public Book updateBook(Book book);

}
