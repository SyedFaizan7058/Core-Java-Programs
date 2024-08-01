package com.lab.movie;

public class Movie {

	private String title;
	private int releaseDate;
	private String genre;

	public Movie(String title, int releaseDate, String genre) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
