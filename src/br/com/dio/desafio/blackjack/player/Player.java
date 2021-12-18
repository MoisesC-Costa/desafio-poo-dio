package br.com.dio.desafio.blackjack.player;

import br.com.dio.desafio.blackjack.deck.Card;

public class Player {
    private final String name;
    private final Hand hand;
    private boolean playing;
    private boolean win;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
        this.playing = true;
        this.win = true;
    }

    public String getHand() {
        return hand + " Pontos: " + getScore();
    }

    public String getName(){
        return name;
    }

    public int getScore() {
        return hand.getCalcCards();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void clearHand(){
        hand.removeAll(hand);
        setPlaying(true);
        setWin(true);
    }

    @Override
    public String toString() {
        return String.format("Jogador %s com %d pontos\nMão=%s\n",
                this.name, this.getScore(), this.getHand());
    }

    public boolean isWin() {
        if(isPlaying()){
            return false;
        } else {
            return this.win;
        }
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
