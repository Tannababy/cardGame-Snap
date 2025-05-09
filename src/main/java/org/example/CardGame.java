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
            Card cardOnTopOfDeck = deckOfCards.getFirst();
            deckOfCards.remove(cardOnTopOfDeck);
            return cardOnTopOfDeck;
        }

        // Sorts the deck in number order (e.g. 2222333344445555...) and stores the new shuffled deck back into the deckOfCards attribute.
        public ArrayList<Card> sortDeckInNumberOrder(){
            Collections.sort(deckOfCards, Comparator.comparingInt(card -> card.getValue()));
            return deckOfCards;
        }

        // Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and stores the new shuffled deck back into the deckOfCards attribute.
        public ArrayList<Card> sortDeckIntoSuits() {
            Collections.sort(deckOfCards, Comparator.comparing(card -> card.getSuit()));
            return deckOfCards;
        }

//      Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute.
        public void shuffleDeck(ArrayList<Card> deckOfCards) {
            Collections.shuffle(deckOfCards);
        }

}


