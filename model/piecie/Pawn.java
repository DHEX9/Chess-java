package model.piecie;

public class Pawn extends Piece{
    public Pawn(String color, int[] position, char symbol){
        super(color, position, symbol);
        
    }

    @Override
    public boolean isValidMove(){
        return true;
    }

    @Override
    public int[] getMove(){
        
    }
    
}
