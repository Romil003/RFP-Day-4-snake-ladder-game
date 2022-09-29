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
            int option = (int)Math.floor(Math.random()*3);
            switch (option) {
                case 0 :
                    System.out.println("No play,remain at position ...");
                    break;
                case 1 :

                    if(player1<80) {
                        System.out.println("Whoow !! Got ladder ...");
                        player1 += dieRoll;
                    }
                    System.out.println(player1);
                    break;
                case 2:
                    if(player1>18 && player1<95) {
                        System.out.println("Oops !!! beaten by snake buddy ...");
                        player1 -= dieRoll;
                    }
                    System.out.println(player1);
                    break;

            }
        }



    }
}
