package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {

    private Player currentPlayer;
    private Player player0ne = new Player("PlayerOne");
    private Player playerTwo = new Player("PlayerTwo");

    public Snap() {
    }

    Scanner scanner = new Scanner(System.in);

    public String startGame() {
        System.out.println("Press enter to start the game: ");

        shuffleDeck(deckOfCards);

        List<Card> dealtCardsList = new ArrayList<>();

        currentPlayer = player0ne;

        while(!deckOfCards.isEmpty()){

            scanner.nextLine();

            Card newCard = dealCard();
            System.out.println(newCard);

            // To only allow comparison of card symbols from the 2nd turn
           if(!dealtCardsList.isEmpty()) {

               // To check if newCard has the same symbol as the last card that was dealt
                if (newCard.getValue() == dealtCardsList.getLast().getValue()) {
                    return "Player has Won";
                }
            }

           System.out.println(currentPlayer.getName());

           if (currentPlayer == player0ne) {
               currentPlayer = playerTwo;
           } else {
               currentPlayer = player0ne;
           }

            dealtCardsList.add(newCard);

            System.out.println("Press enter for the next turn: ");
        }

        return "No winner";
    }



}
