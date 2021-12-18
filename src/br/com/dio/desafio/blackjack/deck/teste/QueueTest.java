package br.com.dio.desafio.blackjack.deck.teste;

import br.com.dio.desafio.blackjack.deck.Card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        List<String> pool = new LinkedList<>();

        pool.add("Moises");
        pool.add("Jose");
        pool.add("Maria");
        pool.add("Melissa");

        System.out.println(pool);

        Collections.shuffle(pool);
        System.out.println(pool);

        for(String nome: pool) System.out.println(nome);
        pool.removeAll(pool);
        System.out.println(pool);

    }
}
