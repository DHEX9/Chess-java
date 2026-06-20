package model;

import game.Inicialization.Player;

public class Pawn extends Piece{
    private boolean doubleAdvance = true;

    public Pawn(Player color, String symbol){
        super(color, symbol);
    }

    @Override
    public boolean isValidMove(int[] move){

        
        return true;
    }

    @Override
    public MoveType[][] calculateValidMoves(Piece[][] board, Player player, int[] position){
        return null;
    }
}
