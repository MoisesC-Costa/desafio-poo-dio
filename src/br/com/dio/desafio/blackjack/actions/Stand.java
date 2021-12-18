package br.com.dio.desafio.blackjack.actions;

import br.com.dio.desafio.blackjack.player.Player;

public class Stand implements Action{
    @Override
    public void peform(Player author) {
        author.setPlaying(false);
    }
}
