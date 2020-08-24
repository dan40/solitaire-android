package com.droidcluster.solitaire.model;

public class Card {

    private Suit suit;
    private Rank rank;

    enum Color {
        Red,
        Black;
    }

    enum Suit {
        Club("\u2663", Color.Black),
        Diamond("\u2666", Color.Red),
        Heart("\u2665", Color.Red),
        Spade("\u2660", Color.Black);

        public String symbol;
        public Color color;

        Suit(String symbol, Color color) {
            this.symbol = symbol;
            this.color = color;
        }
    }

    enum Rank {
        Ace(1, "A"),
        Two(2, "2"),
        Three(3, "3"),
        Four(4, "4"),
        Five(5, "5"),
        Six(6, "6"),
        Seven(7, "7"),
        Eight(8, "8"),
        Nine(9, "9"),
        Ten(10, "10"),
        Jack(11, "J"),
        Queen(12, "Q"),
        King(13, "K");

        public int value;
        public String symbol;

        Rank(int value, String symbol) {
            this.value = value;
            this.symbol = symbol;
        }
    }
    
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object other) {
        Card otherCard = (Card) other;
        return this.rank == otherCard.rank && this.suit == otherCard.suit;
    }

    @Override
    public String toString() {
        return rank.name() + " of " + suit.name();
    }

}
