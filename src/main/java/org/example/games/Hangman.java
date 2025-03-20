package org.example.games;

public class Hangman {

    private String head = "O";
    private String body = "|";
    private String leftArmAndLeg = "/";
    private String rightArmAndLeg = "\"";

    public Hangman() {

    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public String getLeftArmAndLeg() {
        return leftArmAndLeg;
    }

    public String getRightArmAndLeg() {
        return rightArmAndLeg;
    }


}
