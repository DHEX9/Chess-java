package model.piece;

import game.Inicialization.Player;

public class Queen extends Piece{
    public Queen(Player color, String symbol, int[] position){
        super(color, symbol, position);
    }

    @Override
    public boolean isValidMove(int[] position){
        return true;
    }

    @Override
    public MoveType[][] calculateValidMoves(Piece[][] board){
        return null;
    }
    @Override
    public Piece[][] pieceMove(Piece[][] board, Piece piece){
        
        return board;
    }
}
