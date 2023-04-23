package com.example.demo.miniMapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
			DELETE FROM MovieDiary.MovieInfo
			WHERE Title = #{title}
			""")
	int delete(String title);
	
	@Select("""
			SELECT * FROM MovieDiary.MovieInfo
			""")
	List<MovieInfo> list();
	
	@Update("""
			UPDATE 
			""")
	int change();
}
