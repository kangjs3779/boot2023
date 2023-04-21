package com.example.demo.miniContoroller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.MovieInfo;
import com.example.demo.miniMapper.MovieMapper;

@Controller
@RequestMapping("minipro")
public class MovieDiaryController {
	
	@Autowired
	private MovieMapper mapper;
	
	@RequestMapping("movieDiaryHomePage")
	public void method1() {
		// 다른 곳으로 forward/redirect
		// 회원가입, 아이디 찾기, 비번 찾기
		// 영화 정보 추가하기
		// 영화 정보 조회하기
		// 영화 정보 삭제하기
		// 영화 검색 하기(구글 검색으로 이동)
	}
	
	@RequestMapping("search")
	public void method2() {
		//result forward
	}
	
	@RequestMapping("searchResult")
	public void method3(String title, Model model) {
		MovieInfo info = mapper.search(title);
		model.addAttribute("info", info);
	}
	
	
	@RequestMapping("add")
	public void method3() {
		//check forward
	}
	
	@RequestMapping("addCheck")
	public void method4(
			String title, 
			LocalDate releaseDate, 
			String director, 
			String note) {
		MovieInfo info = new MovieInfo();
		info.setTitle(title);
		info.setReleaseDate(releaseDate);
		info.setDirector(director);
		info.setNote(note);
		int count = mapper.add(info);
		System.out.println(count + "개 추가됨 ");
	}
	
	@RequestMapping("delete")
	public void method5() {
		//delete check forward
	}
}














