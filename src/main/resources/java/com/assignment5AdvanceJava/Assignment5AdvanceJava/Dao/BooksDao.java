package com.assignment5AdvanceJava.Assignment5AdvanceJava.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Book;

public interface BooksDao extends JpaRepository<Book,String>{

}
