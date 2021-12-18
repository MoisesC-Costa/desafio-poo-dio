package br.com.dio.desafio.blackjack.deck;

public class Card {
    private final String suit;
    private final String name;
    private final int value;

    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" + name
                + " de " + suit +"}";
    }
}
