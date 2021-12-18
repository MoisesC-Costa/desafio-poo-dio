# desafio-poo-dio

## Sobre o Projeto

- Projeto criado para servir como resposta ao Desafio de POO do Bootcamp da DIO. Para praticar o conceito de programação orientado a objeto.

- A ideia é abstrair para o Java o Jogo Blackjack (21) simplificado.

## Jogo

- O jogo consiste em um baralho de 52 cartas, sendo seu objetivo comprar cartas até o número 21 ou o mais próximo a isso, se um jogador estourar o número total de cartas.

- Ações;
  - Pick: Pega uma carta do baralho e coloca ela na mão.
  - Stand: Finalizar sua mão, quando estiver satisfeito com a quantidade de pontos.

## Estrutura

- Classe BlackjackMain: Essa é a classe que vai rodar o jogo, dentro do método main ela instancia um Objeto BlackjackMain e aciona o método run que roda a estrutura principal do jogo.

## Pacotes de Domínio

### Actions

- As classes desse pacote implementam a interface Action, e executa o método perform, isso serve para evitar o uso da estrutura Switch Case através do polimorfismo, quando um jogador for escolher a ação.
- Classe Pick: Implementa à ação de comprar uma carta do baralho.
- Classe Stand: Implementa à ação de parar de comprar cartas.

### Deck

- Card: Classe que abstrai as cartas do baralho.
- Deck: Classe que abstrai o baralho, no construtor ela cria as cartas e adiciona no pool, no final do processo ela já embaralha as cartas.

### Player

- Player: Classe que abstrai os jogadores, possuindo um objeto da classe Hand.
- Hand: Classe que abstrai a mão dos jogadores, ela herda as funcionalidades classe ArrayList\<Card> e serve para segurar as cartas que o jogador segura tendo o método getCalcCards para retornar o valor total da mão dos jogadores.
