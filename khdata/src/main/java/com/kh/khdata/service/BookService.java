package com.kh.khdata.service;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BookService {
	
	// 이위섭.
	@Repository
	public void error(String book_name) {
		return book_name;
	}
	
}
