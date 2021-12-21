package main.java.classes_objects;

import java.util.Locale;

public class Card {
    private int rank;
    private String suit;
    public static final String[] SUITS = {"Clubs", "Hearts", "Spades", "Diamonds"};
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
