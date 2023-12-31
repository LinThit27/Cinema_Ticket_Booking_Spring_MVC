package com.cinemamanage.model;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MovieBean {
	private String movieID;
	@NotEmpty(message="")
	private String movieName;
	private LocalDate  movieCreateTime;
	private LocalDate  movieUpdateTime;
	private LocalDate  movieDeleteTime;
	@NotEmpty(message="")
	private String movieDuration;
	@NotEmpty(message="")
	private String movieDescription;
	@NotEmpty(message="")
	private String movieGenre;
	@NotEmpty(message="")
	private CommonsMultipartFile image;
	
	private String createdAdmin;
	private String updatedAdmin;
	private String deletedAdmin;
	
	private MultipartFile movieImage;
	
	
	public String getCreatedAdmin() {
		return createdAdmin;
	}
	public void setCreatedAdmin(String createdAdmin) {
		this.createdAdmin = createdAdmin;
	}
	public String getUpdatedAdmin() {
		return updatedAdmin;
	}
	public void setUpdatedAdmin(String updatedAdmin) {
		this.updatedAdmin = updatedAdmin;
	}
	public String getDeletedAdmin() {
		return deletedAdmin;
	}
	public void setDeletedAdmin(String deletedAdmin) {
		this.deletedAdmin = deletedAdmin;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public LocalDate  getMovieCreateTime() {
		return movieCreateTime;
	}
	public void setMovieCreateTime(LocalDate  movieCreateTime) {
		this.movieCreateTime = movieCreateTime;
	}
	public LocalDate  getMovieUpdateTime() {
		return movieUpdateTime;
	}
	public void setMovieUpdateTime(LocalDate  movieUpdateTime) {
		this.movieUpdateTime = movieUpdateTime;
	}
	public LocalDate  getMovieDeleteTime() {
		return movieDeleteTime;
	}
	public void setMovieDeleteTime(LocalDate  movieDeleteTime) {
		this.movieDeleteTime = movieDeleteTime;
	}
	public String getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}

	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public MultipartFile getMovieImage() {
		return movieImage;
	}
	public void setMovieImage(MultipartFile movieImage) {
		this.movieImage = movieImage;
	}
}
