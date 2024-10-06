package org.example.games;
import java.util.Arrays;

public class TicTacToe {

    private String[] board;

    String turn;

    public TicTacToe() {
    }

    public TicTacToe(String[] board) {
        this.board = board;
    }

    public String[] getBoard() {
        return board;
    }

    public void setBoard(String[] board) {
        this.board = board;
        clearBoard();


    }

    public void clearBoard() {
        for(int i = 0; i < this.board.length; i++) {
            this.board[i] = String.valueOf(i + 1);
        }
    }

    public String getTurn() {
        return turn;
    }
    public void setTurn(String turn) {
        this.turn = turn;
    }

    //Step 1: Determine win conditions
    public String checkWinner() {

        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
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

            if (line.equals("XXX")) {
                return "X wins!";
            }
            if (line.equals("OOO")) {
                return "O wins";
            }
        }

        for(int j = 0; j <= 9; j++) {
            if (Arrays.asList(board).contains(String.valueOf(j + 1))) {
                break;
            } else if (j == 9) {
                return "Draw!";
            }
        }

        System.out.println(turn + "'s turn. Choose a spot to place " + turn + ":");
        return null;
    }

        //Step 4: Print game board
        public void printBoard () {
            System.out.println(" " + board[0] + " || " + board[1] + " || " + board[2] + " \n" +
                    "============= \n" +
                    " " + board[3] + " || " + board[4] + " || " + board[5] + " \n"  +
                    "============= \n" +
                    " " + board[6] + " || " + board[7] + " || " + board[8] + " \n" );
        }
    }
