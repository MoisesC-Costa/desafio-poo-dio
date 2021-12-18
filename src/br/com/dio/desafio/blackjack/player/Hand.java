package br.com.dio.desafio.blackjack.player;

import br.com.dio.desafio.blackjack.deck.Card;

import java.util.ArrayList;

class Hand extends ArrayList<Card>{

    public int getCalcCards() {
        int c = 0;
        for (Card card : this) {
            c += card.getValue();
        }

        return c;
    }
}
