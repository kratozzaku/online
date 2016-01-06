package krt;

import java.util.ArrayList;

public class MusicCollection {
	
	private String name;
	private ArrayList<Album> albums ;
	
	public MusicCollection(String name) {
		super();
		this.name = name;
		this.albums = new ArrayList<Album>();
	}

	public String getName() {
		return name;
	}

	// Add song to album list
	public boolean addAlbum(String title) {
		Album existingAlbum = findAlbum(title);
		
		if (existingAlbum == null) {
			Album newAlbum = new Album(title);
			this.albums.add(newAlbum);
			return true;
		}
		
		return false;
	}
		
	
	// find and return album object
	private Album findAlbum (String title) {
		
		for (int i = 0; i < this.albums.size(); i++) {
			Album checkedAlbum = this.albums.get(i);
			if (checkedAlbum.getTitle().equals(title)) {
				return checkedAlbum;
			}
		}
		return null;
	}
	
	// Returns false if album does not exist or song already on file. 
	public boolean addSong (String songTitle, double duration, String albumTitle) {
		Album existingAlbum  = findAlbum(albumTitle);
		
		if ( existingAlbum != null) {
			if (existingAlbum.addSong(songTitle, duration)) {
				return true;
			}
		}
		return false;
	}
	
	public void displayAlbumsAndSongs() {
		System.out.println("=========== Your Music ===========");
		System.out.println("-- Album\n\tSong : 00m.00s  ");
		System.out.println("----------------------------------");
		for (int i = 0; i < this.albums.size(); i++) {
			Album currentAlbum = this.albums.get(i);
			System.out.println("-- " + currentAlbum.getTitle() + " --");
			
			for (int j = 0; j < currentAlbum.getSongs().size(); j++) {
				Song currentSong = currentAlbum.getSongs().get(j);
				System.out.println("\t"+(j+1) + ". " + currentSong.getTitle() + " : " + currentSong.getDuration());
				
			}
			System.out.println("");
			
		}
	}
	
	



	

	
	
}
