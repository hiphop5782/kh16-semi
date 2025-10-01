package com.kh.khdata.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @Builder @AllArgsConstructor 
public class StudentDto {
	private int studentNo;
	private String studentName;
	private int studentKor;
	private int studentEng;
	private int studentMat;
	private Timestamp studentReg;
}
