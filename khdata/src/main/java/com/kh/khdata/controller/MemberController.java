package com.kh.khdata.controller;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.khdata.dao.MemberDao;
import com.kh.khdata.dto.MemberDto;

import jakarta.servlet.http.HttpSession;

public class MemberController {
	@Autowired
	private MemberDao memberDao;
	
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto memberDto, 
				HttpSession session) {
		//1. 전달된 아이디로 데이터베이스의 회원정보를 탐색
		MemberDto findDto = memberDao.selectOne(memberDto.getMemberId());
		if(findDto == null) return "redirect:/member/login?error";
		//(주의) findDto에는 회원의 모든 정 보가 있고, memberDto에는 아이디랑 비밀번호 뿐이다
		
		//2. 비밀번호 비교
		boolean isLogin = findDto.getMemberPw().equals(memberDto.getMemberPw());
		
		if(isLogin) {
			//로그인 성공 시 HttpSession에 이 사용자가 로그인을 성공했음을 데이터로 저장
//			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//			findDto.setMemberLogin(timestamp);
//			memberDao.login(findDto.getMemberId());
			
			session.setAttribute("loginId", findDto.getMemberId());
			session.setAttribute("loginLevel", findDto.getMemberLevel());
			
			memberDao.updateMemberLogin(findDto.getMemberId());
			
			//비밀번호 변경 검사
			//=findDto.getMemberChange()와 현재시간의 차이를 계산
			//findDto.getMemberChange()가 null이면 안됨
			LocalDateTime last = findDto.getMemberChange().toLocalDateTime();
			LocalDateTime now = LocalDateTime.now();
			Duration d = Duration.between(last, now);
			if(d.toDays() >= 30) {
				return "";
			}
			
//			boolean isUpdatePassword = memberDao.isUpdatePassword(findDto.getMemberId());
//			if(isUpdatePassword) {
//				return "redirect:/member/password";
//			}
			
			return "redirect:/";
		}
		else {
			return "redirect:/member/login?error";
		}
	}
}
