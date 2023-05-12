package com.example.demo.comtroller;

import java.time.*;
import java.util.*;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub38")
public class Controller38 {
	
	@GetMapping("view")
	public void view() {
		
	}
	
	// @ResponseBody
	//ResponseEntity<B>
	
	@GetMapping("link1")
	public ResponseEntity method1() {
		ResponseEntity res = new ResponseEntity(HttpStatusCode.valueOf(500));
		return res;
	}
	
	@GetMapping("link2")
	public ResponseEntity method2() {
		ResponseEntity res = ResponseEntity.ok().build();
		return res;
	}
	
	@GetMapping("link3")
	public ResponseEntity method3() {
		ResponseEntity res = ResponseEntity.notFound().build();
		return res;
	}
	
	@GetMapping("link4")
	public ResponseEntity method4() {
		HttpHeaders header = new HttpHeaders();
		header.add("my-header1", "my-value1");
		header.add("my-header2", "my-value2");
		ResponseEntity res = new ResponseEntity(header, HttpStatusCode.valueOf(200));
		
		return res;
	}
	
	@GetMapping("link5")
	public ResponseEntity<String> method5() {
		ResponseEntity<String> res = new ResponseEntity<>("hello reponse", HttpStatusCode.valueOf(200));
		
		return res;
	}
	
	@GetMapping("link6")
	public ResponseEntity<String> method6() {
		
		return ResponseEntity.ok("hello response 2222");
	}
	
	@GetMapping("link7")
	public ResponseEntity<LocalDateTime> method7() {
		LocalDateTime date = LocalDateTime.now();
		return ResponseEntity.ok(date);
	}
	
	@GetMapping("link8")
	@ResponseBody
	public String method8() {
		String dateTime = LocalDateTime.now().toString();
		
		return dateTime;
	}
	
	@GetMapping("link9")
	@ResponseBody
	public String method9() {
		String time = LocalTime.now().toString();
		
		String time1 = LocalTime.now().getHour() + "시" + LocalTime.now().getMinute() + "분" + LocalTime.now().getSecond() + "초";
		
		return time1;
	}
	
	@GetMapping("link10")
	@ResponseBody
	public ResponseEntity<String> method10() {
		String data = """
				{"name":"lee", "age":33}
				""";
		
		HttpHeaders header = new HttpHeaders();
		header.set("Content-Type", "application/json");
		return new ResponseEntity(data, header, 200);
	}
	
	@GetMapping("link12")
	@ResponseBody // + 리턴타입이 Map, JavaBean(타입이면) json string으로 변환, 
	//Content-Type : application/json으로 셋팅
	//header.set("Content-Type", "application/json"); 이걸 쓸 필요가 없다는 것이다
	public Map method12() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "박지성");
		map.put("age", 55);
		return map;
	}
	
	@GetMapping("link13")
	@ResponseBody
	public Map method13() {
		Map<String, Object> map = new HashMap<>();
		map.put("address", "seoul");
		map.put("price", 3.14);
		
		return map;
		
	}
	
	@GetMapping("link14")
	@ResponseBody
	public Map method14() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "차범근");
		map.put("score", 3.25);
		map.put("married", true);
		map.put("position", null);
		map.put("child", List.of("차두리","차하나"));
		map.put("food", Map.of("중식", "짬뽕", "coffee","아아"));
		
		return map;
	}
	
	@GetMapping("link15")
	@ResponseBody
	public Dto1 method15() {
		Dto1 data = new Dto1();
		// getter가 중요함
		return data;
	}
	
	static class Dto1 {
		public String getName() {
			return "강백호";
		}
		public Integer getAge() {
			return 33;
		}
	}
	
	
	@GetMapping("link16")
	@ResponseBody
	public Dto2 method16() {
		
		return new Dto2();
	}
	static class Dto2 {
		public String getCity() {
			return "jeju";
		}
		
		public Double getScore() {
			return 3.3;
		}
		
		public boolean getCap() {
			return true;
		}
		public List<String> getFood() {
			return List.of("pizza", "chicken", "burger");
		}
		public Dto1 getSub1() {
			return new Dto1();
		}
		public Map<String, Object> getSub2() {
			return Map.of("model", List.of("a", "b", "c",123));
		}
	}
	
	@GetMapping("link17")
	@ResponseBody
	public List<String> method17() {
		
		return List.of("a", "b", "c");
		
	}
	@GetMapping("link18")
	@ResponseBody
	public List<Map<String, Object>> method18() {
		
		return List.of(Map.of("name","강백호"),
				Map.of("name","채치수"),
				Map.of("name","정대만"));
	}
	
	@GetMapping("link19")
	@ResponseBody
	public List<Dto2> method19() {
		return List.of(new Dto2(), new Dto2());
	}
}