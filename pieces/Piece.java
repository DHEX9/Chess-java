package pieces;

public class Piece {
    private String color;
    private int position_x;
    private int position_y;
    private char symbol;
    
    public Piece(String color, int  position_x, int position_y, char symbol){
        this.color = color;
        this.position_x = position_x;
        this.position_y = position_y;
        this.symbol = symbol;
    }

    //Getters
    public int getPosition_x(){
        return position_x;
    }

    public int getPosition_y(){
        return position_y;
    }

    public String getColor(){
        return color;
    }

    public char getSymbol(){
        return symbol;
    }

    //Setters
    public void setPosition_x(int position_x){
        this.position_x = position_x;
    }

    public void setPosition_y(int position_y){
        this.position_y = position_y;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }
}