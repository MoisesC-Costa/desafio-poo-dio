package br.com.dio.desafio.blackjack.deck;

import java.util.*;

public class Deck {
    private Queue<Card> pool;
    private List<Card> graveyard;

    public Deck(){
        pool = new LinkedList<>();
        graveyard = new ArrayList<>();

        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] nomes = {"Rei", "Rainha", "Valete"};

        for (String suit : suits){
            pool.add(new Card(suit, "As", 1));

            for(int i = 2 ; i < 11 ; i++) {
                pool.add(new Card(suit, ""+i, i));
            }

            for(String nome: nomes) {
                pool.add(new Card(suit, nome, 10));
            }

        }

        shuffle();

    }

    // Embaralhar as cartas da pool
    private void shuffle() {
        Collections.shuffle((List<Card>) pool);
    }

    // Pega a carta para o jogado e adiciona ela ao graveyard
    public Card pick() {
        Card choose = pool.poll();
        graveyard.add(choose);
        return choose;
    }

    // Pega as cartas do graveyard e devolve para a pool
    public void reset() {
        for(Card card: graveyard) {
            pool.add(card);
        }
        graveyard.removeAll(graveyard);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "pool=" + pool +
                '}';
    }
}
