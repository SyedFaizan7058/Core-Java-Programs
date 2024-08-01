package com.lab.reservation;

public class MainMovie {

	public static void main(String[] args) {

//		MovieReservationSystem movie = new MovieReservationSystem();

		MovieReservationSystem.MovieDatabase d = new MovieReservationSystem().new MovieDatabase();

		d.checkMovieDetails(MovieGenre.ACTION);

		d.checkMovieDetails(MovieGenre.ROMANCE);

		d.checkMovieDetails(MovieGenre.COMEDY);

	}

}
