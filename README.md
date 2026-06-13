# /game
## game.java

Começa o event loop

- Cria o tabueiro e as peças
- começas as rodadas

- Começa com as peças brancas
Chama -> UI

Output imprime estado atual
Chama input

game <- input
output -> Todas as jogadas possíveis
(Chama -> board.piece.calculateValidMoves() que usa isValidMove()
chama -> showMoves() -> imprime todas as jogadas possíveis.)

retorna void, volta pra game.java
game <- input da posiçao

Game valida com if(board.piece.isValidMove(input))

game faz boad.move(input)
if(ninguem) move
if(inimigo) delta inimigo

game roda condiçoes para ver se acabou, se não troca de turno

volta pra cima.