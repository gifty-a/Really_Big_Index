package main.java.classes_objects;

import java.util.Scanner;

public class CardApp {
    static Deck newDeck = new Deck();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 1;
        do {
            createNewCard();
            count++;
        } while (count <= 52);
        scanner.close();
        newDeck.disPlayCards();
    }

    public static void createNewCard() {
        int ranKEntered;
        String suitEntered;
        do {
            System.out.println("Enter Rank");
            ranKEntered = scanner.nextInt();
            if (!isValidRank(ranKEntered)) System.out.println("Please enter a value between 2-10");
        }while (isValidRank(ranKEntered) == false);
        do {
            System.out.println("Enter suit");
            suitEntered = scanner.next();
            if (!isValidSuit(suitEntered)) System.out.println("Wrong suit entered");
        }while (isValidSuit(suitEntered) == false);
        newDeck.addCard(ranKEntered,suitEntered);
    }
    public static boolean isValidRank(int value) {
        if (value < 2 || value > 10) {
            return false;
        }
        return true;}

    public static boolean isValidSuit(String suit) {
        for (int i = 0; i < Card.SUITS.length; i++) {
            if (suit.toLowerCase().equals(Card.SUITS[i].toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
