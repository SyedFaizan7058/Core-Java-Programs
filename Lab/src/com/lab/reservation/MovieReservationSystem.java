package com.lab.reservation;

enum MovieGenre {

	ACTION, ROMANCE, COMEDY

}

class Movie {

	private boolean isAvailable;
	private double rating;

	public Movie(boolean isAvailable, double rating) {
		super();
		this.isAvailable = isAvailable;
		this.rating = rating;
	}

	public boolean isAvailable() {

		return isAvailable;
	}

	public double getRating() {
		return rating;
	}

}

public class MovieReservationSystem {

	class MovieDatabase {

		private Movie actionMovie;
		private Movie romanceMovie;
		private Movie comedyMovie;

		public MovieDatabase() {
			actionMovie = new Movie(true, 8.0);
			romanceMovie = new Movie(false, 7.5);
			comedyMovie = new Movie(true, 7.8);
		}

		public Movie getMovie(MovieGenre genre) {

			switch (genre) {

			case ACTION:
				return actionMovie;
			case COMEDY:
				return romanceMovie;
			case ROMANCE:
				return comedyMovie;
			default:
				return null;

			}

		}

		public void checkMovieDetails(MovieGenre genre) {

			Movie movie = getMovie(genre);

			if (movie != null) {
				System.out.println("Genre: " + genre);
				System.out.println("Movie is available for booking: " + movie.isAvailable());
				System.out.println("Movie Rating: " + movie.getRating());
				System.out.println();
			} else {
				System.out.println("Genre: " + genre);
				System.out.println("Movie not found for this genre.");
				System.out.println();
			}

		}
	}

}
