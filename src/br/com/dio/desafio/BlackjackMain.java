package br.com.dio.desafio;

import br.com.dio.desafio.blackjack.actions.Action;
import br.com.dio.desafio.blackjack.actions.Pick;
import br.com.dio.desafio.blackjack.actions.Stand;
import br.com.dio.desafio.blackjack.deck.Deck;
import br.com.dio.desafio.blackjack.player.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlackjackMain {
    private final Scanner scanner;
    private final Map<String, Action> actions;
    private final Deck deck;

    public BlackjackMain() {
        scanner = new Scanner(System.in);
        deck = new Deck();

        actions = new HashMap<>();
        actions.put("pick", new Pick(deck));
        actions.put("stand", new Stand());
    }

    public static void main(String[] args){
        BlackjackMain app = new BlackjackMain();
        app.run();
    }

    public void run(){
        Player[] players = {new Player("1"), new Player("2")};

        while (true){
            System.out.println("###############################");
            System.out.println("########## BLACKJACK ##########");
            System.out.println("###############################");

            for (int turn = 0 ; turn < 23 ; turn++){
                Player player = players[turn%2];
                Player next = players[(turn+1)%2];

                if (player.isPlaying()){
                    readActionAndRun(player);
                    checkScore(player);
                }

                if (!(player.isPlaying() || next.isPlaying())){
                    break;
                }
            }

            Player vencedor = checkWinPlyer(players[0], players[1]);

            if (vencedor != null){
                System.out.println("O vencedor foi " + vencedor);
            } else {
                System.out.println("Não teve vencedores");
            }

            System.out.print("Deseja continuar jogando(S/n): ");
            String op = scanner.nextLine().toLowerCase();

            if (op.equals("n")){
                break;
            }

            // Resetando o jogo para uma nova jogada
            for (Player player: players){
                player.clearHand();
            }
            deck.reset();

        }

        scanner.close();
    }

    private void readActionAndRun(Player player){
        boolean notValid = true;
        do{
            System.out.print("Jogador " + player.getName()+": ");
            String jogada = scanner.nextLine().toLowerCase();
            Action action = actions.get(jogada);

            if (action != null){
                action.peform(player);
                notValid = false;
            } else {
                System.out.println("Ação não existente");
            }
        } while (notValid);
    }

    private void checkScore(Player player){
        int score = player.getScore();

        if (score > 21){
            player.setPlaying(false);
            player.setWin(false);
        } else if (score == 21){
            player.setPlaying(false);
        }
    }

    private Player checkWinPlyer(Player first, Player second){
        if (first.getScore() == second.getScore()){
                return new Player(null){

                    @Override
                    public String toString() {
                        return "Ambos Jogadores";
                    }
                };
        } else if (first.isWin() && second.isWin()){
            if (first.getScore() > second.getScore()){
                return first;

            } else {
                return second;
            }
        } else if (first.isWin()){
            return first;
        } else if (second.isWin()){
            return second;
        } else{
            return null;
        }
    }

}
