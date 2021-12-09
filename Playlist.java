// This creates a user-defined playlist using ArrayList method with some commonly used commands in ArrayList
// Swap song E and F 

import java.util.ArrayList;


class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("A - Jaychou");
    desertIslandPlaylist.add("B - Jaychou");
    desertIslandPlaylist.add("C - Jaychou");
    desertIslandPlaylist.add("D - Jaychou");
    desertIslandPlaylist.add("E - Jaychou");
    desertIslandPlaylist.add("F - Jaychou");

    desertIslandPlaylist.remove(0);


    int indexOfSongE = desertIslandPlaylist.indexOf("E - Jaychou");
    int indexOfSongF = desertIslandPlaylist.indexOf("F - Jaychou");
    String tempE = "E - Jaychou";
    String tempF = "F - Jaychou";
    desertIslandPlaylist.set(indexOfSongE, tempF);
    desertIslandPlaylist.set(indexOfSongF, tempE);


    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
  }
  
}
