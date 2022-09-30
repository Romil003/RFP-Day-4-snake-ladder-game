package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static int player1 = 0;
    static int player2 = 0;
    public static void main(String[] args) {
        int dieRoll1 = 0;
        int dieRoll2 = 0;
        int numDieRoll1 = 0;
        int numDieRoll2 = 0;

        while(player1 != 100 && player2 != 100) {
            dieRoll1 = (int) Math.floor(Math.random() * 6) + 1;
            numDieRoll1++;
            System.out.println("Number of times die rolls for Player1 is " + numDieRoll1);
            System.out.println("For Player1 Die roll value = " + dieRoll1);
            player1 = dieRoll1 + player1;
            dieRoll2 = (int) Math.floor(Math.random() * 6) + 1;
            numDieRoll2++;
            System.out.println("Number of times die rolls for Player2 is " + numDieRoll2);
            System.out.println("For Player2 Die roll value = " + dieRoll2);
            player2 = dieRoll2 + player2;
            if (player1 > 100) {
                player1 = player1 - dieRoll1;
            }
            if (player2 > 100) {
                player2 = player2 - dieRoll2;
            }
            System.out.println("Player1 is " + player1);
            System.out.println("Player2 is " + player2);
            if (player1 == 100 || player2 == 100) {
                break;
            }
            if (player1 == 11 || player1 == 24 || player1 == 39 || player1 == 48 || player1 == 60 || player1 == 70 || player1 == 79 || player1 == 85) {
                System.out.println("Whoow !! Player1 Got ladder ...");
                dieRoll1 = (int) Math.floor(Math.random() * 6) + 1;
                player1 += dieRoll1;
                System.out.println("Player2 stops ");
                System.out.println(player1);
            } else if (player1 == 17 || player1 == 30 || player1 == 38 || player1 == 54 || player1 == 69 || player1 == 78 || player1 == 83 || player1 == 95) {
                System.out.println("Oops !!! Player1 beaten by snake buddy ...");
                player1 -= dieRoll1;
                System.out.println(player1);
            } else {
                System.out.println("Player1 is at" + player1);
            }

            if(player2 == 11 || player2 == 24 || player2 == 39 || player2 == 48 || player2 == 60 || player2 == 70 || player2 == 79 || player2 == 85) {
                System.out.println("Whoow !! Player2 Got ladder ...");
                dieRoll2 = (int) Math.floor(Math.random() * 6) + 1;
                player2 += dieRoll2;
                System.out.println("Player1 stops ...");
                System.out.println(player2);
            }
            else if(player1 == 17 || player1 == 30 || player1 == 38 || player1 == 54 || player1 == 69 || player1 == 78 || player1 == 83 || player1 == 95) {
                System.out.println("Oops !!! Player2 beaten by snake buddy ...");
                player2 -= dieRoll2;
                System.out.println(player2);
            } else {
                System.out.println("Player2 is at " + player2);
            }


            }
        }



    }

