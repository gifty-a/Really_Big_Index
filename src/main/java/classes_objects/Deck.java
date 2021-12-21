package main.java.classes_objects;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
    }



    public void disPlayCards() {
        int count = 1;
        for (Card card: cards
             ) {
            System.out.println("#"+ count + " " + "rank-" + card.getRank() + " " + "suit-" + card.getSuit());
            count++;
        }
    }

    public void addCard(int rank, String suit) {
        cards.add(new Card(rank, suit));
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}
