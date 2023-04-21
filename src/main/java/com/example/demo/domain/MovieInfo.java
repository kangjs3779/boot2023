package com.example.demo.domain;

import java.time.LocalDate;

public class MovieInfo {
	private int movieIndex;
	private String title;
	private LocalDate releaseDate;
	private String director;
	private String note;
	
	public int getMovieIndex() {
		return movieIndex;
	}
	public void setMovieIndex(int movieIndex) {
		this.movieIndex = movieIndex;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "MovieInfo [movieIndex=" + movieIndex + ", title=" + title + ", releaseDate=" + releaseDate
				+ ", director=" + director + ", note=" + note + "]";
	}
	
	
	
}
