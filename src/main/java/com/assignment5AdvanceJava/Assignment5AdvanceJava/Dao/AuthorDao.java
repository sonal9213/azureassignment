package com.assignment5AdvanceJava.Assignment5AdvanceJava.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Author;

public interface AuthorDao extends JpaRepository<Author, String> {

}
