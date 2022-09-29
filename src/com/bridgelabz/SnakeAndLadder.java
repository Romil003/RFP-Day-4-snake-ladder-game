package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static int player1 = 0;
    public static void main(String[] args) {
        int dieRoll = 0;

        while(player1 != 100){
            dieRoll = (int)Math.floor(Math.random()*6)+1;
            System.out.println("Die roll value = " + dieRoll);
            player1 = dieRoll + player1;
            if (player1 >100 ){
                player1 = player1 - dieRoll;
            }
            System.out.println(player1);
        }



    }
}
