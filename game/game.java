package game;

import model.piece.Piece;
import ui.Output;

public class Game {

    public static void Start(Piece[][] board){
        Output.output(board);
    }
}
