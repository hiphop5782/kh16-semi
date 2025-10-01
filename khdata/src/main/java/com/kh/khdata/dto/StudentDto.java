package com.kh.khdata.dto;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDto {
	private int studentNo;
	private String studentName;
	private int studentKor;
	private int studentEng;
	private int studentMat;
	private Timestamp studentReg;
}
