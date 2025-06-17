import java.util.ArrayList;

public class DesertIslandPlaylist {

	public static void main(String[] args) {
		// Create the master playlist
		ArrayList<String> playlist = new ArrayList<>();
		  playlist.add("Bohemian Rhapsody");
	      playlist.add("Imagine");
	      playlist.add("Africa");
	      playlist.add("Here Comes the Sun");
	      playlist.add("Redbone");
	      playlist.add("No Woman No Cry");
	      playlist.add("Lose Yourself");
	      playlist.add("Take On Me");
	      playlist.add("Hotel California");
	      playlist.add("Clair de Lune");

	      // Desert island playlist (only 5 even allowed)
	      ArrayList<String> desertIslandPlaylist = new ArrayList<>();
	      
	      for (int i = 0; i < playlist.size(); i++) {
	    	  if (i % 2 == 0) {
	    		  desertIslandPlaylist.add(playlist.get(i));
	    	  }
	      }
	      
	      // Print both playlists
	      System.out.println("Full Playlist: \n" + playlist);
	      System.out.println("Desert Island Playlist: \n" + desertIslandPlaylist);
	      
	      // Swap 2 songs
	      String temp = desertIslandPlaylist.get(0);
	      desertIslandPlaylist.set(0, desertIslandPlaylist.get(4));
	      desertIslandPlaylist.set(4,  temp);
	      
	      System.out.println("After swapping:");
	      System.out.println("Desert Island Playlist: " + desertIslandPlaylist);
	}

}
