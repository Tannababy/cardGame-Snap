package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

        ArrayList<Card> deckOfCards = new ArrayList<Card>();

        public CardGame() {
            createDeckOfCards();
        }

        public void createDeckOfCards() {

            for(CardSuit suit : CardSuit.values()) {
                for(CardValue symbol : CardValue.values()) {
                    Card newCard = new Card(symbol, suit);
                    deckOfCards.add(newCard);
                }
            }
        }

        public ArrayList<Card> getDeck() {
            return deckOfCards;
        }

        // Takes the card from the top of the deck and returns it.
        public Card dealCard() {
            return deckOfCards.getFirst();
        }

        // Sorts the deck in number order (e.g. 2222333344445555...) and stores the new shuffled deck back into the deckOfCards attribute.
        public ArrayList<Card> sortDeckInNumberOrder(){
            Collections.sort(deckOfCards, Comparator.comparingInt(card -> card.getValue()));
            return deckOfCards;
        }

//      Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute.
        public ArrayList<Card> shuffleDeck(ArrayList<Card> deckOfCards) {
            Collections.shuffle(deckOfCards);
            return deckOfCards;
        }

}


