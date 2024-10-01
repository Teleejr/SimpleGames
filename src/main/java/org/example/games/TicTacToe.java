package org.example.games;

public class TicTacToe {

    private String board = "   ||   ||   \n" +
            "=============\n" +
            "   ||   ||   \n" +
            "=============\n" +
            "   ||   ||   \n";

    @Override
    public String toString() {
        return "TicTacToe!\n" + board;
    }
}
