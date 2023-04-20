package com.example.demo.mapper;

import java.time.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper01 {
	
	//이 어노테이션에다가 쿼리를 넣어주면 된다
	@Select("""
			SELECT CustomerName 
			FROM Customers 
			WHERE CustomerID = 1
			""")
	String method1();
	//CustomerName을 뽑아서 리턴해줄 테니까 String타입의 메소드로 만든다
	
	@Select("""
			SELECT FirstName
			FROM Employees
			WHERE EMployeeId = 1
			""")
	String method2();
	
	@Select("""
			SELECT SupplierName
			FROM Suppliers
			WHERE SupplierID = 1
			""")
	String method3();
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerID = #{id}
			""")
	String method4(Integer id);
	// customerId는 int타입의 컬럼이다 근데 엄격하지 않으니까
	//String id를 파라미터로 넣어도 되지만 그냥 타입을 맞춰봄
	// ?가 들어가는 자리에 #{파라미터이름}이 들어가면 된다
	
	@Select("""
			SELECT LastName 
			FROM Employees
			WHERE EmployeeId = #{id}
			""")
	String method5(int id);
	
	@Select(
			"""
			SELECT Price
			FROM MyTable33
			LIMIT 1
			"""
			
			)
	int method6();
	
	//--------------------------------------- 내가 한거
//	
//	@Select("""
//			SELECT Weight
//			FORM MyTable33
//			WHERE 
//			""")
//	//코드 복사
//	
//	@Select ("""
//			SERECVT Ttile,
//					published,
//					price,
//					weighted,
//			FORM MyTable33
//					limit 1
//			"""
//		)// 컬렁명 과 대소문자 구분 없이 매치돼는 빈의 프로퍼티며
//	String method10();
	//------------------------------------------ 내가 한거
	@Select("""
			SELECT Weight
			FROM MyTable33
			LIMIT 1
			""")
	Double method7();
	
	@Select("""
			SELECT Published
			FROM MyTable33
			LIMIT 1
			""")
	LocalDate method8();
	
	@Select("""
			SELECT Updated
			FROM MyTable33
			LIMIT 1
			""")
	LocalDateTime method9();
	
	@Select("""
			SELECT Title, 
				   Published,
				   Price,
				   Updated,
				   Weight
			FROM MyTable33
			LIMIT 1
			""")
	// 컬럼명과 (대소문자구분없이) 매치되는 빈의 프로퍼티명
	Dto06 method10();
	// ------------------------------------------- 선생님이 한거
	
	@Select("""
			SELECT
				Name,
				Age,
				Price,
				Birth,
				Inserted
			FROM MyTable32
			LIMIT 1
			""")
	Dto05 method11();
	
	@Select("""
			SELECT
				CustomerID,
				CustomerName,
				ContactName,
				Address,
				City,
				PostalCode,
				Country
			FROM Customers
			WHERE CustomerId = 7
			""")
	Customer method12();
	
	@Select("""
			SELECT * FROM Suppliers WHERE SupplierId = 2
			""")
	Supplier method13();
	
	@Select("""
			SELECT
				EmployeeId id,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeId = 5
			""")
	Employee method14();
}
