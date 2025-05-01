package org.example;

import java.util.ArrayList;

import static org.example.CardSuit.*;

public class CardGame {
//    public ArrayList<Card> getDeck() {
//        return deckOfCards;
//    }

    public static void main(String[] args) {

        ArrayList<Card> deckOfCards = new ArrayList<Card>(52);
//        for (CardSuit suit : CardSuit.values()) {}

        Card firstCard = new Card("", "2", 2);

        System.out.println(firstCard);
    }
}

