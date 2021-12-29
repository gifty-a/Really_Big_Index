package main.java.udemy.abstract_nested_interface;

public class Song {
    private String songTitle;
    private double duration;
    private String genre;
    private Artist artist;

    public Song(String songTitle, double duration, String genre, Artist artist) {
        this.songTitle = songTitle;
        this.duration = duration;
        this.genre = genre;
        this.artist = artist;
    }
    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
        this.genre = null;
        this.artist = null;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Title : " + getSongTitle() + "\n" +
                "Artist : " + getArtist().getArtistName() + "\n" +
                "Duration : " + getDuration() + "\n" +
                "Genre : " + getGenre();
    }
}
