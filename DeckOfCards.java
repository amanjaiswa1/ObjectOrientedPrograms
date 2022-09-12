package com.assignment.day11.OOPS;

import java.util.*;

public class DeckOfCards {
	Random rn = new Random();
    ArrayList<Cards> cards = new ArrayList<>();
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public  DeckOfCards() {
        int d = 0;
        while (d < 9) {
            int su = rn.nextInt(suit.length);
            int ra = rn.nextInt(rank.length);
            cards.add(new Cards(suit[su], rank[ra]));
            d++;
        }
    }

    public ArrayList<Cards> getDeck() {
        return cards;
    }
    
    public static void main(String[] args) {
        DeckOfCards player1 = new DeckOfCards();
        System.out.println("Cards Received By Player1 :\n"+player1.getDeck()+"\n");

        DeckOfCards player2 = new DeckOfCards();
        System.out.println("Cards Received By Player2 :\n"+player2.getDeck()+"\n");

        DeckOfCards player3 = new DeckOfCards();
        System.out.println("Cards Received By Player3 :\n"+player3.getDeck()+"\n");

        DeckOfCards player4 = new DeckOfCards();
        System.out.println("Cards Received By Player4 :\n"+player4.getDeck()+"\n");
    }
}

class Cards {
    String suit;
    String rank;

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit ;
    }
}
