import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {
        Random random = new Random();
        /* UC 1: Snake and Ladder game played with
        SINGLE PLAYER at start position 0 */
        int position = 0;
        int diceCount = 0;

        System.out.println("SINGLE PLAYER GAME STARTED");

        /*UC 2 to UC 6: Single Player Game */
        while (position < 100) {

            /* UC 2: Player rolls the die to get number 1 to 6 */
            int dice = random.nextInt(6) + 1;
            diceCount++;

            /* UC 3: Check option using RANDOM
               0 = No Play
               1 = Ladder
               2 = Snake
            */
            int option = random.nextInt(3);

            System.out.println("Dice Rolled: " + dice);

            if (option == 0) {
                // UC 3: No Play – player stays in same position
                System.out.println("No Play");
            }
            else if (option == 1) {
                // UC 3: Ladder – move ahead by dice value
                System.out.println("Ladder");

                // UC 5: Ensure exact winning position 100
                if (position + dice <= 100) {
                    position = position + dice;
                }
            }
            else {
                // UC 3: Snake – move behind by dice value
                System.out.println("Snake");
                position = position - dice;

                // UC 4: If position goes below 0, restart from 0
                if (position < 0) {
                    position = 0;
                }
            }

            /* UC 6: Print position after every dice roll */
            System.out.println("Current Position: " + position);
        }

        /* UC 6: Report dice count */
        System.out.println(" SINGLE PLAYER WON THE GAME");
        System.out.println("Total Dice Rolls: " + diceCount);

        /* UC 7: TWO PLAYER GAME , If player gets Ladder, plays again and Report which player won */
        System.out.println("\nTWO PLAYER GAME STARTED");

        int player1Position = 0;
        int player2Position = 0;

        int player1DiceCount = 0;
        int player2DiceCount = 0;

        boolean player1Turn = true;

        while (player1Position < 100 && player2Position < 100) {

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            if (player1Turn) {

                player1DiceCount++;
                System.out.println("Player 1 rolls: " + dice);

                if (option == 0) {
                    System.out.println("No Play");
                }
                else if (option == 1) {
                    System.out.println("Ladder");

                    if (player1Position + dice <= 100) {
                        player1Position += dice;
                    }

                    // UC 7: Extra chance on Ladder
                    System.out.println("Player 1 gets another chance");
                }
                else {
                    System.out.println("Snake");
                    player1Position -= dice;

                    if (player1Position < 0) {
                        player1Position = 0;
                    }

                    player1Turn = false;
                }

                System.out.println("Player 1 Position: " + player1Position);
                System.out.println();

                if (option != 1) {
                    player1Turn = false;
                }
            }
            else {

                player2DiceCount++;
                System.out.println("Player 2 rolls: " + dice);

                if (option == 0) {
                    System.out.println("No Play");
                }
                else if (option == 1) {
                    System.out.println("Ladder");

                    if (player2Position + dice <= 100) {
                        player2Position += dice;
                    }

                    // UC 7: Extra chance on Ladder
                    System.out.println("Player 2 gets another chance");
                }
                else {
                    System.out.println("Snake");
                    player2Position -= dice;

                    if (player2Position < 0) {
                        player2Position = 0;
                    }

                    player1Turn = true;
                }

                System.out.println("Player 2 Position: " + player2Position);
                System.out.println();

                if (option != 1) {
                    player1Turn = true;
                }
            }
        }

        /* UC 7: Report winner */
        if (player1Position == 100) {
            System.out.println("PLAYER 1 WON THE GAME");
            System.out.println("Dice rolls by Player 1: " + player1DiceCount);
        } else {
            System.out.println(" PLAYER 2 WON THE GAME");
            System.out.println("Dice rolls by Player 2: " + player2DiceCount);
        }
    }
}
