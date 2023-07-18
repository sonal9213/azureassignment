package com.assignment5AdvanceJava.Assignment5AdvanceJava.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Author;
import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Book;
import com.assignment5AdvanceJava.Assignment5AdvanceJava.Service.AuthorService;
import com.assignment5AdvanceJava.Assignment5AdvanceJava.Service.BookService;


@RestController
public class MyController {
	
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/books")
	public List<Book> Books() {
		return this.bookService.getBooks();
	}
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	@DeleteMapping("/deleteBook/{BookId}")
	public Book Delete(@PathVariable Integer BookId) {
		return this.bookService.deleteBook(BookId);
		
	}
	@PostMapping("/update")
	public Book update(@RequestBody Book book) {
		return this.bookService.updateBook(book);
		
	}
	@GetMapping("/authors")
	public List<Author> getAuthor(){
		return this.authorService.getAuthor();
	}

}
