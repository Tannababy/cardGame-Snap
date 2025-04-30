package org.example;

public enum CardSuits {
    SPADES("Spades"), HEARTS("Hearts"), DIAMONDS("Diamaonds"), CLUBS("Clubs");

    private final String suitString; // field that stores the string name of the suits

    private CardSuits(String suitString) {
        this.suitString = suitString;
    } // ctor that takes the sting name of suit

    public String getSuitString() {
        return suitString;
    } // method to get the suit string name
}
