package com.example.demo.miniMapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.MovieInfo;

@Mapper
public interface MovieMapper {
	
	@Select("""
			SELECT Title, ReleaseDate, Director, Note
			FROM MovieDiary.MovieInfo
			WHERE Title = #{title}
			""")
	MovieInfo search(String title);
	
	@Insert("""
			INSERT INTO MovieDiary.MovieInfo 
				(Title, ReleaseDate, Director, Note)
			VALUES
				(#{title}, #{releaseDate}, #{director}, #{note})
			""")
	int add(MovieInfo info);
	
	@Delete("""
			
			""")
	int delete();
}
