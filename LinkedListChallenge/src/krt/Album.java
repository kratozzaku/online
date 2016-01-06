package krt;

import java.util.ArrayList;

public class Album {
	
	private String title;

	private ArrayList<Song> songs;
	
	public Album(String title) {
		super();
		this.title = title;
		this.songs = new ArrayList<Song>();
	}

	public String getTitle() {
		return title;
	}
	
	public ArrayList<Song> getSongs() {
		return songs;
	}

	// Add song to album list
	public boolean addSong(String title, double duration) {
		Song existingSong = findSong(title, duration);
		
		if (existingSong == null) {
			Song newSong = new Song(title, duration);
			songs.add(newSong);
			return true;
		}
		
		return false;
	}

	// find and return song object
	private Song findSong(String title, double duration) {
		
		for (int i = 0; i < this.songs.size(); i++) {
			Song checkedSong = this.songs.get(i);
			if (checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	

	
	
	
}
