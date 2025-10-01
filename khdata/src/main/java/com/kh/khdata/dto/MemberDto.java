package com.kh.khdata.dto;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(exclude={"memberPw"})
public class MemberDto {
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String memberBirth;
	private String memberContact;
	private String memberEmail;
	private String memberLevel;
	private Integer memberPoint;
	private String memberPost;
	private String memberAddress1;
	private String memberAddress2;
	private Timestamp memberJoin;
	private Timestamp memberChange;
}
