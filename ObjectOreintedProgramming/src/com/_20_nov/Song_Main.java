package com._20_nov;

import java.util.ArrayList;

class Song {

	private String title;
	private String artist;
	private double duration;

	public Song(String title, String artist, double duration) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

}

class Playlist {

	public ArrayList<Song> al = new ArrayList<>();
	double sum;

	public void addSong(Song songs) {

		al.add(songs);
//		for (Song song : songs) {
//
//			System.out.println(song);
//			sum += song.getDuration();
//		}
	}

	public double getTotalDuration() {
		for (int i = 0; i < al.size(); i++)
			sum += al.get(i).getDuration();
		return sum;

	}
}

public class Song_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song s1 = new Song("Jitega india", "Arjit sigh", 4.30);
		Song s2 = new Song("mahiye", "Arjit sigh", 3.35);
		Song s3 = new Song("Kala Star", "Honey sigh", 3.80);
		Song s4 = new Song("Streate Celebrity", "Kyden", 2.90);

		Song[] song = { s1, s2, s3, s4 };

		Playlist p = new Playlist();
		for (int i = 0; i < song.length; i++)
			p.addSong(song[i]);

		System.out.println("Total duration of a song is : " + p.getTotalDuration());

	}

}
