package org.example;

public class Card {
    private String suit;
    private String symbol; // (2,3,4,5,6,7,8,9,10,J,Q,K,A)
    private int value; //  (2,3,4,5,6,7,8,9,10,11,12,13,14)

    public Card(CardSuit suit, String symbol, int value) {
        this.suit = suit.toString();
        this.symbol = symbol;
        this.value = value;
    }

//    public String toString() {
//        return symbol + " " + value;
//    }
}
