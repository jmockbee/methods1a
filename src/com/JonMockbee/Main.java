package com.JonMockbee;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       calculateScore(true,800,levelCompleted,bonus);


         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }
    }

    // just adding for commit
    public static void calculateScore (boolean gameOver,int score,int levelCompleted,int bonus ){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore+= 1000;
            System.out.println("Your final score " + finalScore);
        }
    }
}
