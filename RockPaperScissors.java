/*
Rock paper scissors
Rock beats scissors beats paper beats rock
 */
package Project1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String[] rps = {"r","p","s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner s = new Scanner(System.in);

        while (true) {
            String playerMove;
            while (true) {
                System.out.println("Please enter your move (r, p, s)");
                playerMove = s.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    break;
                } else
                    System.out.println(playerMove + " is not a valid move");
            }

            System.out.println("Computer played: " + computerMove );

            if(playerMove.equals(computerMove)){
                System.out.println("The game was a tie");
            }
            else if (playerMove.equals("r")){
                if (computerMove.equals("p")){
                    System.out.println("You lose!");
                } else if(computerMove.equals("s")){
                    System.out.println("You win!");
                }
            }

            else if (playerMove.equals("p")){
                if (computerMove.equals("s")){
                    System.out.println("You lose!");
                } else if(computerMove.equals("r")){
                    System.out.println("You win!");
                }
            }
            else {
                if (computerMove.equals("r")){
                    System.out.println("You lose!");
                } else if(computerMove.equals("p")){
                    System.out.println("You win!");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = s.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }

        }
        s.close();

    }


}

