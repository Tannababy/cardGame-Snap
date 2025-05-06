package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {

    public Snap() {
    }

    Scanner scanner = new Scanner(System.in);

    public String startGame() {
        System.out.println("Press enter to start the game: ");

        shuffleDeck(deckOfCards);

        List<Card> dealtCardsList = new ArrayList<>();

        while(!deckOfCards.isEmpty()){
            scanner.nextLine();
            Card newCard = dealCard();
            System.out.println(newCard);

            //The game continues until two cards in a row have the same symbol, at which point the “player” wins and the game ends.
           if(!dealtCardsList.isEmpty()) {
                if (newCard.getValue() == dealtCardsList.getLast().getValue()) {
                    return "Player has Won";
                }
            }

            dealtCardsList.add(newCard);

            System.out.println("Press enter for the next turn: ");
        }

        return "No winner";
    }



}
