package org.example.games;

public class RockPaperScissors {

    private int rock = 1;
    private int paper = 2;
    private int scissors = 3;

    //holds the moves each player makes
    private int[] play = new int[2];

    //Holds winner for best out of three
    private int[] response = new int[4];

    public RockPaperScissors(){}

    public int[] getPlay() {
        return play;
    }

    public void setPlay(int[] play) {
        this.play = play;
    }

    public int[] getResponse() {
        return response;
    }

    public void setResponse(int[] response) {
        this.response = response;
    }

    public String checkWinner(){

        //Put logic for counting rounds, and giving opponent play in a separate method starting here

        for(int i = 0; i <= 9; i++) {

            switch(i) {
                case 1:
                    if(play[0] == rock && play[1] == rock)
                        return "Rock! It's a draw";
                    break;
                case 2:
                    if(play[0] == rock && play[1] == paper)
                        return "Paper covers rock!";
                    break;
                case 3:
                    if(play[0] == rock && play[1] == scissors)
                        return "Rock breaks scissors!";
                    break;
                case 4:
                    if(play[0] == paper && play[1] == paper)
                        return "Paper! It's a draw!";
                    break;
                case 5:
                    if(play[0] == paper && play[1] == rock)
                        return "Paper covers rock!";
                    break;
                case 6:
                    if(play[0] == paper && play[1] == scissors)
                        return "Scissors cuts paper!";
                    break;
                case 7:
                    if(play[0] == scissors && play[1] == scissors)
                        return "Scissors! It's a draw!";
                    break;
                case 8:
                    if(play[0] == scissors && play[1] == paper)
                        return "Scissors cuts paper!";
                    break;
                case 9:
                    if(play[0] == rock && play[1] == rock)
                        return "Rock breaks scissors!";
                    break;
            }
        }
        return "Game over!";
    }

    public void playRps() {
        //use play and response arrays to get and hold who wins and loses
        //Use a random number generator between one and three to determine opponent response
        //Once it's working, add logic to get the opponent to change its play if it loses
    }
}
