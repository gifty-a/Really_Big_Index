package main.java.udemy.generics;

public class Player {
    private String playerNm;
    private int playerAge;
    private String countryOfOrigin;
    double rating;
    int goals, assists, red, yellow;

    public Player(String playerNm, int playerAge, String countryOfOrigin) {
        this.playerNm = playerNm;
        this.playerAge = playerAge;
        this.countryOfOrigin = countryOfOrigin;
        this.rating = 0.0;
        this.goals= this.yellow = this.assists = this.red = 0;
    }

    public Player(String playerNm, int playerAge, String countryOfOrigin, double rating, int goals, int assists, int red, int yellow) {
        this(playerNm,playerAge,countryOfOrigin);
        this.rating = rating;
        this.goals = goals;
        this.assists = assists;
        this.red = red;
        this.yellow = yellow;
    }

    public String getPlayerNm() {
        return playerNm;
    }

    public void setPlayerNm(String playerNm) {
        this.playerNm = playerNm;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public String printPlayerStats() {
        return "Goals : " + goals +"\n" +
                "Assists : " + assists + "\n" +
                "Yellow : " + yellow + "\n" +
                "Red : " + red + "\n" +
                "Rating : " + rating + "\n" +
                "---------------------------";
    }
}
