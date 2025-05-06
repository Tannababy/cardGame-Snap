package org.example;

import java.util.Scanner;

public class Snap extends CardGame {

    public Snap() {
    }

    Scanner scanner = new Scanner(System.in);

    public Card startGame() {
        System.out.println("Press enter to start the game: ");
        while(!deckOfCards.isEmpty()){
            shuffleDeck(deckOfCards);
            scanner.nextLine();
            Card newCard = dealCard();
            System.out.println(newCard);
            System.out.println("Press enter for the next turn: ");
        }
        return dealCard();
    }

}
