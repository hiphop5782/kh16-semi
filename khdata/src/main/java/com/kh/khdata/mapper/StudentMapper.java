package com.kh.khdata.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.khdata.dto.StudentDto;

@Component
public class StudentMapper implements RowMapper<StudentDto> {
	//주석 추가
	@Override
	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentNo(rs.getInt("student_no"));
		studentDto.setStudentName(rs.getString("student_name"));
		studentDto.setStudentKor(rs.getInt("student_kor"));
		studentDto.setStudentEng(rs.getInt("student_eng"));
		studentDto.setStudentMat(rs.getInt("student_mat"));
		studentDto.setStudentReg(rs.getTimestamp("student_reg"));
		return studentDto;
	}

}
