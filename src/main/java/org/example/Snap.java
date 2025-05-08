package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {

    private final Player playerOne = new Player("PlayerOne");
    private final Player playerTwo = new Player("PlayerTwo");

    public Snap() {
    }

    Scanner scanner = new Scanner(System.in);

    public String startGame() {
        System.out.println("---- Welcome to Snap!! ----");
        System.out.println("Press enter to start the game.");

        shuffleDeck(deckOfCards);

        Card previousCard = null;

        Player currentPlayer = playerOne;

        while(!deckOfCards.isEmpty()){

            scanner.nextLine();

            Card newCard = dealCard();
            System.out.println("Card dealt: " + newCard);
            System.out.println("----- End of " + currentPlayer.getName() + "'s Turn -----\n");

            // To only allow comparison of card symbols from the 2nd turn
           if(previousCard != null) {

               // To check if newCard has the same symbol as the last card that was dealt
                if (newCard.getValue() == previousCard.getValue()) {
                    // Snap Detected
                    System.out.println("!!! SNAP DETECTED !!!");
                    System.out.println("Each player has 2 seconds to type 'snap'!");


                    boolean snapDetected = false;

                        System.out.println(currentPlayer.getName() + ", type 'snap' within 2 seconds!");

                        long startTime = System.currentTimeMillis();
                        String input = scanner.nextLine();
                        long endTime = System.currentTimeMillis() - startTime;

                        if (endTime > 2000) {
                            System.out.println("Too slow! That was " + endTime/1000 + " seconds.");

                        } else if (input.equalsIgnoreCase("snap")) { // detects player inputted "snap"

                            return currentPlayer.getName() + " wins with a quick SNAP!";

                        } else {
                            System.out.println("Incorrect input.");
                        }
                }
            }


           if (currentPlayer == playerOne) {
               currentPlayer = playerTwo;
           } else {
               currentPlayer = playerOne;
           }

            previousCard = newCard;

            System.out.println("Press enter " + currentPlayer.getName() + " to deal the next card.");
        }

        return "No winner, the deck ran out of cards! :(";
    }



}
