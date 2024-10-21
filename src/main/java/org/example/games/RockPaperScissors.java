package org.example.games;

public class RockPaperScissors {

    private int rock = 1;
    private int paper = 2;
    private int scissors = 3;
    private int[] play = new int[3];
    private int[] response = new int[3];

    public String checkWinner(){


        for(int i = 0; i <= 9; i++) {

            switch(i) {
                case 1:
                    if(play[i] == rock && response[i] == rock)
                        return "Rock! It's a draw";
                    break;
                case 2:
                    if(play[i] == rock && response[i] == paper)
                        return "Paper covers rock!";
                    break;
                case 3:
                    if(play[i] == rock && response[i] == scissors)
                        return "Rock breaks scissors!";
                    break;
                case 4:
                    if(play[i] == paper && response[i] == paper)
                        return "Paper! It's a draw!";
                    break;
                case 5:
                    if(play[i] == paper && response[i] == rock)
                        return "Paper covers rock!";
                    break;
                case 6:
                    if(play[i] == paper && response[i] == scissors)
                        return "Scissors cuts paper!";
                    break;
                case 7:
                    if(play[i] == scissors && response[i] == scissors)
                        return "Scissors! It's a draw!";
                    break;
                case 8:
                    if(play[i] == scissors && response[i] == paper)
                        return "Scissors cuts paper!";
                    break;
                case 9:
                    if(play[i] == rock && response[i] == rock)
                        return "Rock breaks scissors!";
                    break;
                default: return "Game over!";
            }
        }
        return "";
    }
}
