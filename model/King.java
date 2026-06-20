package model;

import game.Inicialization.Player;

public class King extends Piece{
    private boolean roque = true;

    public King(Player color, String symbol){
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

    public boolean roque(){
        return true;
    }

    public boolean doesNotLeaveKingInCheck(){
        return true;
    }
}
