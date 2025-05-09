package org.example;
import java.util.Scanner;

public class Snap extends CardGame {

    private final Player playerOne = new Player("PlayerOne");
    private final Player playerTwo = new Player("PlayerTwo");

    Scanner scanner = new Scanner(System.in);

    public Snap() {
    }

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

            // To only allow comparison of card symbols from the 2nd turn and their symbols
           if(previousCard != null && previousCard.getValue() == newCard.getValue()) {

               Player winingPlayer = checkForWinner();
               if(winingPlayer != null) {
                   System.out.println(winingPlayer.getName() + " won the game with a quick SNAP!");
               } else {
                   System.out.println("No one snapped in time, the game continues...");
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


    private Player checkForWinner() {

        Player[] players = {playerOne, playerTwo};

        System.out.println("!!! SNAP DETECTED !!!");
        System.out.println("Each player has 2 seconds to type 'snap'!");

        for (Player player : players) { // to switch players if missed snap opportunity

            System.out.println(player.getName() + ", type 'snap' within 2 seconds!");

            long startTime = System.currentTimeMillis();
            String input = scanner.nextLine();
            long endTime = System.currentTimeMillis() - startTime;

            if (endTime > 2000) {
                System.out.println("Too slow! That was " + endTime / 1000 + " seconds.");

            } else if (input.equalsIgnoreCase("snap")) { // detects player inputted "snap"

                return player;

            } else {
                System.out.println("Incorrect input.");
            }
        }
        return null;
    }
}
