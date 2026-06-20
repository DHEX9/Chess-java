package model;

import game.Inicialization.Player;
import model.Piece.MoveType;

public class Queen extends Piece{
    public Queen(Player color, String symbol){
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
