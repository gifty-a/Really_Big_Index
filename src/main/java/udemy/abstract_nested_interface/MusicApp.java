package main.java.udemy.abstract_nested_interface;

import java.util.ArrayList;

public class MusicApp {
    public static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album tpb = new Album("To pimp a butterfly", new Artist("Kendrick Lamar","Interscope"));
        albums.add(tpb);
        tpb.addSong("I", 3.66);
        tpb.getSongList();
    }
}
