package com.kh.khdata.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
	
	// 이위섭.
	@Transactional
	public int error(String book_name) {
		return -1;
	}
}
