package com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	int AuthorId;
	String AuthorName;
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

}
