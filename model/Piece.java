package model;

import game.Inicialization.Player;

public abstract class Piece {
    private final Player color;
    private final String symbol;
    
    MoveType[][] moveType;

    public Piece(Player color, String symbol){
        this.color = color;
        this.symbol = symbol;
    }

    public enum MoveType {
        MOVE,
        CAPTURE,
        ENPASSANT
    }
    
    //Getters

    public Player getColor(){
        return color;
    }

    public String getSymbol(){
        return symbol;
    }

    public MoveType[][] getMoveType(){
        return moveType;
    }

    //Setters

    public void setMoveType(MoveType[][] moveType){
        this.moveType = moveType;
    }

    public boolean isLocked(){

        for (MoveType[] row : moveType) {
            for (MoveType col : row) {
                if(col != null){
                    return false;
                }
            }
        }

        return true;
    }
    
    public abstract boolean isValidMove(int[] move);

    public abstract MoveType[][] calculateValidMoves(Piece[][] board, Player player, int[] position);

}