package main.java.udemy.abstract_nested_interface;

public class Artist {
    private String artistName;
    private String recordLabel;

    public Artist(String artistName, String recordLabel) {
        this.artistName = artistName;
        this.recordLabel = recordLabel;
    }

    public Artist(String artistName) {
        this.artistName = artistName;
        this.recordLabel = "Independent Artist";
    }

    public String getArtistName() {
        return artistName;
    }
}
