package org.example;

import java.util.ArrayList;


public class Deck {
    ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public Deck() {
    }

    public ArrayList<Card> createDeckOfCards() {

        for(CardSuit suit : CardSuit.values()) {
            for(CardValue symbol : CardValue.values()) {
                    Card newCard = new Card(symbol, suit);
                    deckOfCards.add(newCard);
            }
        }
        return deckOfCards;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }
}
