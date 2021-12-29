package main.java.udemy.abstract_nested_interface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private SongList songs;
    private Artist artist;
    private String albumName;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Album(String name, Artist artist) {
        this.albumName = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public void addSong(String title, double duration) {
        songs.addSong(new Song(title, duration));
    }

    public void addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song selectedSong = songs.findSong(trackNumber);
        if (selectedSong != null) {
            playList.add(selectedSong);
        }
        System.out.println("This album does not have the track " + trackNumber);
    }

    public void addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song selectedSong = songs.findSong(songTitle);
        if (selectedSong != null) {
            playList.add(selectedSong);
        }
        System.out.println("This album does not have the track " + songTitle);
    }

    public void getSongList(){
        songs.printTrackList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (this.songs.contains(song)) {
                System.out.println("Song already exists");
                return false;
            }
            this.songs.add(song);
            System.out.println(song.getSongTitle() + " has been added");
            return true;
        }

        public Song findSong(String songName) {
            for (Song song : this.songs
            ) {
                if (song.getSongTitle().equals(songName)) return song;
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int idx = trackNumber - 1;
            if ((idx >= 0) && (idx < this.songs.size())) return this.songs.get(idx);
            return null;
        }

        public boolean containsSong(String songName) {
            for (Song song: this.songs
                 ) {
                if (song.getSongTitle().equals(songName)) return true;
            }
//            for (int i = 0; i < this.songs.size(); i++) {
//                if (this.songs.get(i).getSongTitle().equals(songName)) {
//                    return true;
//                }
//            }
            return false;
        }

        public int findSongidx(String songName) {
            for (int i = 0; i < this.songs.size(); i++) {
                if (this.songs.get(i).getSongTitle().equals(songName)) {
                    return i;
                }
            }
            return -1;
        }

        public void printTrackList() {
            Song currentSong;
            if (this.songs.isEmpty()) System.out.println("This album has no songs, weird");
            else {
                for (int i = 0; i < this.songs.size(); i++) {
                    currentSong = this.songs.get(i);
                    System.out.println((i + 1) + " " + currentSong.getSongTitle() + " " + currentSong.getDuration() + " ");
                }
            }
        }
    }
}
