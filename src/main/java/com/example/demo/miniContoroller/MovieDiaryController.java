package com.example.demo.miniContoroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("minipro")
public class MovieDiaryController {
	
	@RequestMapping("movieDiaryHomePage")
	public void method1() {
		// 다른 곳으로 forward/redirect
		// 회원가입, 아이디 찾기, 비번 찾기
		// 영화 정보 추가하기
		// 영화 정보 조회하기
		// 영화 정보 삭제하기
		// 영화 검색 하기(구글 검색으로 이동)
	}
}
