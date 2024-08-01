package com.lab.movie;

public class Movie_Name {

	public static void main(String[] args) {

		Movie m = new Movie("End game", 2021, "Avengers");
		System.out.println("Movie Name :" + m.getTitle());
		System.out.println("Release date :" + m.getReleaseDate());
		System.out.println("Movie genre :" + m.getGenre());
		System.out.println("------------------------------");
		m.setTitle("Secrete War");
		System.out.println("Movie Name :" + m.getTitle());
		m.setReleaseDate(2027);
		System.out.println("Release date :" + m.getReleaseDate());
		m.setGenre("Avengers Secret Mission");
		System.out.println("Movie genre :" + m.getGenre());

	}

}
