package com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="books")
public class Book {
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	
	Integer BookCode;
	String BookName;
	String BookAuthor;
	String Date;
	public Book(Integer i, String bookName, String bookAuthor,String date) {
		super();
		BookCode = i;
		BookName = bookName;
		BookAuthor = bookAuthor;
		Date=date;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Integer getBookCode() {
		return BookCode;
	}
	public void setBookCode(Integer bookCode) {
		BookCode = bookCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [BookCode=" + BookCode + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", Date=" + Date
				+ "]";
	}
	
	

}
