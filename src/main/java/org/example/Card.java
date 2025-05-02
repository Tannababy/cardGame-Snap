package org.example;

public class Card {
    private String suit;
    private String symbol; // (2,3,4,5,6,7,8,9,10,J,Q,K,A)
    private int value; //  (2,3,4,5,6,7,8,9,10,11,12,13,14)

    public Card(CardValue symbol, CardSuit suit) {
        this.symbol = symbol.getSymbol();
        this.suit = suit.getSuit();
        this.value = symbol.getValue();
    }

    public String toString() {
        return "["+ symbol + " of " + suit + " " + "(" + value + ")" + "]" + "\n";
    }
}
