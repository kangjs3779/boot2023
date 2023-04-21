package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper04 {
	
	@Delete("""
			DELETE FROM MyTable40
			""")
	int sql1();
	//영향을 미친 행의 개수를 리턴을 해주니까 int타입의 메소드로 선언해준다
	
	@Delete("""
			DELETE FROM MyTable39
			WHERE Col1 = #{id}
			""")
	int sql2(int id);
	
	@Delete("""
			DELETE FROM Customers
			WHERE CustomerId = #{id}
			""")
	int sql3(int id);
}
