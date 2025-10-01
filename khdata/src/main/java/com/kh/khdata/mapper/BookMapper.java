package com.kh.khdata.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.khdata.dao.BookDao;

@Component
public class BookMapper implements RowMapper<BookDao>{

	@Override
	public BookDao mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BookDao bookDao = new BookDao();
		return bookDao;
	}
	// 이위섭
}
