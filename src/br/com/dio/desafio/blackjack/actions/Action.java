package br.com.dio.desafio.blackjack.actions;

import br.com.dio.desafio.blackjack.deck.Deck;
import br.com.dio.desafio.blackjack.player.Player;

public interface Action {
    public void peform(Player author);
}
