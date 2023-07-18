package com.assignment5AdvanceJava.Assignment5AdvanceJava.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment5AdvanceJava.Assignment5AdvanceJava.Dao.AuthorDao;
import com.assignment5AdvanceJava.Assignment5AdvanceJava.Entities.Author;

@Service
public class AuthorServiceImp implements AuthorService {
	@Autowired
	AuthorDao authorDao;

	@Override
	public List<Author> getAuthor() {
		// TODO Auto-generated method stub
		
		return authorDao.findAll();
	}

}
