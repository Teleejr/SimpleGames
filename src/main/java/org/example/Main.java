package org.example;

import org.example.games.RockPaperScissors;
import org.example.games.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        menu();

    }

    public static void menu() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Simple Games! Choose a game to play:\n" +
                "1. Tic Tac Toe\n" +
                "2. Rock Paper Scissors\n" +
                "3. Exit");

        while (scan.hasNext()) {
            int game = scan.nextInt();
            switch (game) {
                case 1 -> ticTacToe();
                case 2 -> rockPaperScissors();
                case 3 -> scan.close();
                default -> menu();
            }
        }
    }
    
    public static void ticTacToe() {
        Scanner scan = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe(new String[9]);
        String[] board = ticTacToe.getBoard();
        String turn = "X";
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
                    ticTacToe.setTurn("O");
                }
                else {
                    turn = "X";
                    ticTacToe.setTurn("X");
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
        menu();
    }

    public static void rockPaperScissors() {

        Scanner scan = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();
        String winner = null;

        System.out.println("Rock, Paper, Scissors!\n Choose between Rock(1), Paper(2), and Scissors(3)");

        while(winner == null) {
            int input = 0;

            input = scan.nextInt();

            if(!(input > 0 && input <= 3)) {
                System.out.println("Invalid entry. Try again.");
                continue;
            }

            winner = rps.checkWinner();
            if(winner.contains("draw")) {
                System.out.println(winner);
            }
            else {
                System.out.println(winner);
            }
        }
        scan.close();

    }
}