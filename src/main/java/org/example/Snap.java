package org.example;

import java.util.Scanner;

public class Snap extends CardGame {

    public Snap() {
    }

    Scanner scanner = new Scanner(System.in);

    public Card startGame() {
        System.out.println("Press enter to start your turn: ");
        scanner.nextLine();
        return dealCard();
    }

}
