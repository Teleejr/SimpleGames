package org.example;

import org.example.games.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe(new String[9], "X");
        String[] board = new String[ticTacToe.getBoard().length];
        String turn = ticTacToe.getTurn();
        String winner = null;

        for(int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        System.out.println("TicTacToe! \nPlayer X, choose where to place your piece.");
        ticTacToe.printBoard();

        while(winner == null) {
            int input;

            try {
                input = scan.nextInt();
                if(!(input > 0 && input <= 9)) {
                    System.out.println("Entry invalid. Try again.");
                    continue;
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Slot taken. Try again.");
                continue;
            }

            if(board[input - 1].equals(String.valueOf(input))) {
                board[input - 1] = turn;

                if(turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
                ticTacToe.printBoard();
                winner = ticTacToe.checkWinner();
            }
            else {
                System.out.println("Spot taken. Try again.");
            }
        }


        if(winner.equalsIgnoreCase("Draw!")) {
            System.out.println(winner);
        }
        else {
            System.out.println(winner + " wins! Good game!");
        }
        scan.close();
    }
}