package game;

import game.Inicialization.Player;
import model.piece.Piece;
import ui.Input;
import ui.Output;

public class Turn {
    public static Player playerTurn(Player player){

        if(player == Player.WHITE) return Player.BLACK;
        return Player.WHITE;

    }

    public static Piece[][] Move(Piece[][] board, Player player){

        while(true){

            Piece piece = Input.choosePiece(board, player);
            piece.calculateValidMoves(board);

            Output.messagePieceConfirmation();
            if(Input.cancelPiece()) continue;

            
            break;
            
        }
        
        return board;
    }
}
