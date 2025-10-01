package com.kh.khdata.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.khdata.mapper.BookMapper;

@Repository
public class BookDao {
	// 이위섭.
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BookMapper bookMapper;
}
