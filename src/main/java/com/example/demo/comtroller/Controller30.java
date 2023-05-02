package com.example.demo.comtroller;

import java.io.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import lombok.*;

@Controller
@RequestMapping("sub30")
public class Controller30 {
	
	// 경로 : /sub30/link1?name=con&age=33
	@GetMapping("link1")
	public void method1() {
		//get방식으로 파일을 보낼 수 없음
		//파일은 항상 post방식으로 보내야 한다 너무 길기때문에
		//이건 view를 위한 메소드
		
	}
	
	// 경로 : /sub30/link1
	@PostMapping("link2")
	public void method2(@RequestParam("myFile") MultipartFile file) {
		//파일을 받기위한 인터페이스 = multipartFile
		//post니까 jsp로 form을 꼭 만들어야 한다
		System.out.println(file.getName());
		System.out.println(file.getSize());
	}
	
	@GetMapping("link3")
	public void method3() {
		//파일 input이 있는 form을 포함한 뷰(link3.jsp)로 포워드
	}
	
	@PostMapping("link4")
	public void method4(@RequestParam("files") MultipartFile[] file) {
		for(MultipartFile f : file) {
			System.out.println(f.getOriginalFilename());
			System.out.println(f.getSize());			
		}
	}
	
	
	@GetMapping("link5")
	public void method5() {
		
	}
	
	@PostMapping("link6")
	public void method6(@RequestParam("files") MultipartFile[] files) {
		for (MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}
	
	@GetMapping("link7")
	public void method7() {
		
	}
	
	@Data
	static class Sub29Dto {
		private String name;
		private Integer age;
	}
	
	@PostMapping("link8")
	public void method8(
			Sub29Dto dto,
			@RequestParam("files") MultipartFile[] files) {
		System.out.println(dto.getName());
		for(MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}
	
	
	@GetMapping("link9")
	public void method9() {
		
	}
	
	@PostMapping("link10")
	public void method10(@RequestParam("file1") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		try (InputStream fis = file.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			// 인풋을 했으니 아웃풋이 필요하다
			String targetFileName = "copy_" + file.getOriginalFilename();
			
			try (FileOutputStream fos = new FileOutputStream(targetFileName);
					BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				byte[] datas = new byte[10000];
				int len = 0;
				while ((len = bis.read(datas)) != -1) {
					System.out.println(len);
					bos.write(datas, 0, len);
				}
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//사용자가 파일을 업로드하면 나의 어플리케이션에 도착을 할 텐데
		//그걸 하드디스크에 저장하는 것이 아니라
		//aws에 다시 업로드 하는 과정
	}
	
	
	@PostMapping("link11")
	public void method11(@RequestParam("file1") MultipartFile file) throws Exception {
		
		File target = new File("C:/study/copy11_" + file.getOriginalFilename());
		file.transferTo(target);
		//하드디스크에 저장하는 간결한 방법
	}
	
	
	
	
	
	
	
	
	
}
