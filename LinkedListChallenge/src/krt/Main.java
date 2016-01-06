package krt;

public class Main {
	

	public static void main(String[] args) {
		
		MusicCollection musicCollection = new MusicCollection("My Music");
		
	 	musicCollection.addAlbum("Lenny's Best");
	 	musicCollection.addAlbum("1995 Christmas Special");
	 	musicCollection.addAlbum("Daft Punk");
	 	
	 	musicCollection.addSong("Lenny and Lenny", 3.20d, "Lenny's Best");
	 	musicCollection.addSong("Lenny loves everyone", 3.11d, "Lenny's Best");
	 	musicCollection.addSong("The answer is Lenny", 3.33d, "Lenny's Best");
	 	musicCollection.addSong("How to Lenny", 1.59d, "Lenny's Best");
	 	musicCollection.addSong("The Hit", 6.40d, "Lenny's Best");
	 	
	 	musicCollection.addSong("Santa's naughty helpers", 2.22d, "1995 Christmas Special");
	 	musicCollection.addSong("Whiteness comes down", 4.21d, "1995 Christmas Special");
	 	musicCollection.addSong("Snow White and seven", 3.59d, "1995 Christmas Special");
	 	musicCollection.addSong("XXXMas", 3.59d, "1995 Christmas Special");
	 	
	 	musicCollection.addSong("Interstella 5555", 5.55d, "Daft Punk");
	 	musicCollection.addSong("One More Time", 2.30d, "Daft Punk");
	 	musicCollection.addSong("Aerodynamic", 1.37d, "Daft Punk");
	 	musicCollection.addSong("Digital Love", 4.59d, "Daft Punk");
	 	musicCollection.addSong("Harder, Better, Faster, Stronger", 2.40d, "Daft Punk");
	 	musicCollection.addSong("Something About Us", 1.55d, "Daft Punk");
	 	musicCollection.addSong("Veridis Quo", 6.55d, "Daft Punk");
	 	musicCollection.addSong("Veridis Quo", 6.55d, "Daft Punk");
	 	
	 	musicCollection.displayAlbumsAndSongs();
		

	}

}
