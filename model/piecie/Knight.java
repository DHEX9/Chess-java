package model.piecie;

public class Knight extends Piece{
    private int[][] offset = {{2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2}, {-1,-2}};

    public Knight(String color, int[]  position, char symbol){
       super(color, position, symbol);
    }

    @Override
    public boolean isValidMove(){
        return true;
    }

    @Override
    public void calculateValidMoves(){

    }

    @Override
    public void showMoves(){

    }

    @Override
    public int[] getMove(){
        
    }
}
