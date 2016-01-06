package krt;

import java.util.LinkedList;

public class PlayList {
	
	private String name;
	private LinkedList<Song> playlist;
	
	public PlayList(String name) {
		super();
		this.name = name;
		playlist = new LinkedList<Song>();
	}

	public String getName() {
		return name;
	}
	
	public LinkedList<Song> getPlaylist() {
		return playlist;
	}
	
	
	
	
	
	
}
