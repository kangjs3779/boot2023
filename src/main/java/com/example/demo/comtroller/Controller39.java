package com.example.demo.comtroller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@RequestMapping("sub39")
@Controller
@ResponseBody
//@RestController = @ResponseBody + @Controller 이거 한 줄만 써도 된다  
public class Controller39 {
	//mapper에서 얻어온 것을 보내겠다
	
	@Autowired
	Mapper02 mapper02;
	
	@GetMapping("link20")
	public List<String> method20() {
		return mapper02.sql1();
	}
	@GetMapping("link21")
	public List<Dto07> method21() {
		return mapper02.sql3();
	}
	@GetMapping("link22")
	public List<Dto08> method22(Integer cid) {
		return mapper02.sql7(cid);
	}
}
