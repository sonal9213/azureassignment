package com.assignment5AdvanceJava.Assignment5AdvanceJava.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Book;

@Repository
public interface BooksDao extends JpaRepository<Book,String>{

}
