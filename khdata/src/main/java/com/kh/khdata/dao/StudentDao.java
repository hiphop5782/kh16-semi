package com.kh.khdata.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.kh.khdata.dto.StudentDto;
import com.kh.khdata.mapper.StudentMapper;

public class StudentDao {
	
	@Autowired
	private StudentMapper studentMapper;
	
	public void insert(StudentDto studentDto) {
		
	}
}
