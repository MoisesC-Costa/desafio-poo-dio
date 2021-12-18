package br.com.dio.desafio.blackjack.actions;

import br.com.dio.desafio.blackjack.deck.Deck;
import br.com.dio.desafio.blackjack.player.Player;

import java.util.Objects;

public class Pick implements Action {
    Deck deck;

    public Pick(Deck deck) {
        this.deck = deck;
    }

    @Override
    public void peform(Player author) {
        author.addCard(deck.pick());
        System.out.println(author.getHand());
    }

}
