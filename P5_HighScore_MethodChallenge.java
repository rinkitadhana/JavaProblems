package com.RinkitAdhana;

public class P5_HighScore_MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Rinkit",calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+" managed to get position "+playerPosition+" on the high score list.");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }else if (score>=500 && score<1000){
            return 2;
        }else if (score>=100 && score<500){
            return 3;
        }else {
            return 4;
        }
    }
}
