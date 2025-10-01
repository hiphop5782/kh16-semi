package com.kh.khdata.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.khdata.dto.StudentDto;

@Component
public class StudentMapper implements RowMapper<StudentDto> {

	@Override
	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
