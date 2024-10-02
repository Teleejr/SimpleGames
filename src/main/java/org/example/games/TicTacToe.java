package org.example.games;

import org.example.pieces.GamePiece;

import java.util.Arrays;

public class TicTacToe {

    private String[] board;
    private GamePiece turn;

    //Step 1: Players choose X or O
    //Step 2: Determine win conditions
    public String winner() {
        String line = "";
        boolean xWins = false;
        boolean oWins = false;

        for(int i = 0; i < 8; i++) {
            switch(i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if(line.equals("XXX")) {
                xWins = true;
                return "X wins!";
            }
            if(line.equals("OOO")) {
                oWins = true;
                return "O wins!";
            }
        }
        return "It's a draw!";
    }
    //Step 3: Players alternately place their pieces
    //Step 4: Display board after each move
    //Step 5: A player wins or draws

    @Override
    public String toString() {
        return "TicTacToe! \n" + board;
    }
}
