package com.kh.khdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.khdata.dao.BookDao;
import com.kh.khdata.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	// 이위섭.
	@Autowired
	private BookDao bookDao;
	@Autowired
	private BookService bookService;
	
	//asdfasdfasdf
}
