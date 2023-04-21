package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper03 {
	
	
	@Insert("""
			INSERT INTO MyTable34 (Col1, Col2)
			VALUES (#{val1}, #{val2})
			""")
	int spl1(int val1, String val2);
	//리턴값은 입력된 record의 개수이다
	
	@Insert("""
			INSERT INTO MyTable35 (Col1, Col2)
			VALUES (#{v1}, #{v2})
			""")
	int sql2(Double v1, String v2);
	
	@Insert("""
			INSERT INTO MyTable36 (Col1, Co12, Col3)
			VALUES (#{prop1},#{prop2},#{prop3})
			""")
	int sql3(Dto09 dto);
	//파라미터가 한개라면 파라미터가 자바빈이라도 따로 접근연산자와 써주지 않아도 된다
	
	@Insert("""
			INSERT INTO MyTable37 (Age, Name, Score)
			VALUES (#{age}, #{name}, #{score})
			""")
	int sql4(Dto10 dto);
	
	@Insert("""
			INSERT INTO MyTable37 (Age, Name, Score)
			VALUES(#{dto09.prop1}, #{dto10.name}, #{dto09.prop3})
			""")
	int sql5(Dto09 dto09, Dto10 dto10);
	
	@Insert ("""
			INSERT INTO MyTavle38 (col1, col2, col3, col4, col5, col6)
			VALUES (#{dto1.prop1}, #{dto2.age}, #{dto1.prop2}, #{dto2.name}, #{dto1.prop3}, #{dto2.score})
			""")
	int sql6(Dto09 dto1, Dto10 dto2);
	
	@Insert("""
			INSERT INTO MyTable39 (Col2, Col3)
			VALUES (#{prop2}, #{prop3})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "prop1")
	int sql7(Dto11 dto);
	//기본값이 false라서 쓰려면 true를 써줘야 함
	//자동생성되는 키를 가지고 오기
	//DB에서 어차피 키값이 자동으로 늘어남
	//그리고 그걸 자바에서 쓰고 싶으니까 use~~를 쓰는거다
	//쓰겠다고 true라고 하면 그 key값을 prop1에 넣겠다 라는 뜻임
	//그래서 113번에는 값이 할당이 안되어서 0인데
	//쿼리가 실행하고 나서는 116번에 그 쿼리에 해당하는 키값이 들어가게 되는 것이다
	
	@Insert("""
			INSERT INTO MyTable40 (Age, Name, Score)
			VALUES (#{age}, #{name}, #{score})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int sql8(Dto12 dto);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
