package com.kh.khdata.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.khdata.dto.BookDto;

@Component
public class BookMapper implements RowMapper<BookDto>{

	// 이위섭.
	@Override
	public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BookDto bookDto = new BookDto();
		return bookDto;
	}
}