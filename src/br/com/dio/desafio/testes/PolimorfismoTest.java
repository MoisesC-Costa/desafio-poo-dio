package br.com.dio.desafio.testes;

import br.com.dio.desafio.blackjack.actions.Action;
import br.com.dio.desafio.blackjack.actions.Pick;
import br.com.dio.desafio.blackjack.actions.Stand;
import br.com.dio.desafio.blackjack.deck.Deck;
import br.com.dio.desafio.blackjack.player.Player;

import java.util.HashMap;
import java.util.Map;

public class PolimorfismoTest {
    public static void main(String[] args){
        Map<String, Action> actions = new HashMap<>();

        System.out.println(actions.get("pastel"));
        actions.put("pick", new Pick(new Deck()));
        actions.put("stand", new Stand());

        Player player = new Player("Jogador");
        System.out.println(player.getHand());

        actions.get("pick").peform(player);
        System.out.println(player.getHand());
        actions.get("pick").peform(player);
        System.out.println(player.getHand());
        actions.get("pick").peform(player);
        System.out.println(player.getHand());
        actions.get("pick").peform(player);
        System.out.println(player.getHand());
        actions.get("pick").peform(player);
        System.out.println(player.getHand());
        actions.get("pick").peform(player);
        System.out.println(player.getHand());
        actions.get("pick").peform(player);
        System.out.println(player.getHand());

    }
}
