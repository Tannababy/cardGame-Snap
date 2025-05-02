package org.example;

import java.util.ArrayList;

public class CardGame {

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck.createDeckOfCards());
        System.out.println(deck.getDeckOfCards().size());
    }

}

