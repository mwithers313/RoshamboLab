import java.util.Scanner;

public class Main {

    public static boolean continueGame() { //play again loop method

        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        char answer = '-';

        System.out.println("Play Again?(y/n):");

        userInput = scnr.next();
        answer = userInput.charAt(0);

        if ((answer == 'Y') || (answer == 'y')) {
            return true;

        } else if ((answer == 'N') || (answer == 'n')) {
        }
        return false;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        GamePlayer gamePlayer = new GamePlayer();

        Roshambo rock = Roshambo.ROCK;
        Roshambo paper = Roshambo.PAPER;// So I created these and then didnt use them?
        Roshambo scissors = Roshambo.SCISSORS;

        boolean playAgain = true;
        while (playAgain) { // this loops the game while the user selects "y" to play again.

            System.out.println("Welcome to Rock Paper Scissors!");
            System.out.print("Enter your name: ");


            String userName = scan.next(); //input is now players name * FIXME string validation needed

            System.out.println("Would you like to play against Terrence or Phillip?: ");

            String playingAgainst = scan.next();






            //Terrence
            if (playingAgainst.equalsIgnoreCase(player1.getName())) { // if the user selected "Terrence" (*Terrence throws Rock everytime)

                System.out.println("Rock, Paper, or Scissors?(R/P/S): ");

                String playerMove = scan.next();//this is the input that asks user for Rock Paper or Scissor. FIXME validation needed

                System.out.println(userName + ": " + gamePlayer.generateRoshambo(playerMove)); // this returns "username + Rock,Paper,or Scissor depending on their input

                System.out.println((player1.getName()) + ": " + rock); // this player throws rock every time.


                if (playerMove.equalsIgnoreCase("r"))  //if user move equals rock
                {
                    System.out.println("Its a draw!!");

                } else if (playerMove.equalsIgnoreCase("p")) { // if user move equals paper

                    System.out.println(userName + " wins!");

                } else if (playerMove.equalsIgnoreCase("s")) {// if user move equals scissors

                    System.out.println(player1.getName() + " wins!");
                }





                //Phillip
            } else if (playingAgainst.equalsIgnoreCase(player2.getName())) { //if the user selected "Phillip" (*Phillip randomly throws)


                System.out.println("Rock, Paper, or Scissors?(R/P/S): ");

                String playerMove = scan.next(); //gamePlayers move FIXME validation
                String computerMove = player2.generateRoshambo(playerMove); // this is Phillips move. It is random


                System.out.println(userName + ": " + gamePlayer.generateRoshambo(playerMove)); //prints out users move
                System.out.println(player2.getName() + ": " + computerMove);// prints out Phillips move

                if ((computerMove.equalsIgnoreCase("Scissors")) && (playerMove.equalsIgnoreCase("r"))) { //Phillip throws Scissors, user throws Rock

                    System.out.println(userName + " wins!"); // user wins

                } else if ((computerMove.equalsIgnoreCase("Rock")) && (playerMove.equalsIgnoreCase("s"))) {//Phillip throws Rock, user throws Scissors

                    System.out.println(player2.getName() + " wins!"); //Phillip wins

                } else if ((computerMove.equalsIgnoreCase("Paper")) && (playerMove.equalsIgnoreCase("s"))) {//Phillip throws Paper, user throws Scissors

                    System.out.println(userName + " wins!"); //user wins

                } else if ((computerMove.equalsIgnoreCase("Rock")) && (playerMove.equalsIgnoreCase("p"))) {//Phillip throws Rock, user throws paper

                    System.out.println(userName + " wins!"); //user wins

                } else if ((computerMove.equalsIgnoreCase("Paper")) && (playerMove.equalsIgnoreCase("r"))) {//Phillip throws Paper, user throws rock

                    System.out.println(player2.getName() + " wins!"); //Phillip wins

                } else if ((computerMove.equalsIgnoreCase("Scissors")) && (playerMove.equalsIgnoreCase("p"))) {//Phillip throws Scissors, user throws paper

                    System.out.println(player2.getName() + " wins!"); //Phillip wins

                } else { //all other options are ties

                    System.out.println("Draw!");
                }
            }


            //playAgain?
            playAgain = continueGame();
        }
        System.out.println("Goodbye");//prints if user does not want to play again
    }
}