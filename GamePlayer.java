/**
 * Created by Michael on 2/11/2017.
 */
public class GamePlayer extends Player {


    @Override
    public String generateRoshambo(String input) {
        //this will take input from the user and then return R,P, or S

        if (input.equalsIgnoreCase("R")) {
            return "ROCK";
        } else if (input.equalsIgnoreCase("P")) {
            return "PAPER";
        } else if (input.equalsIgnoreCase("S")) {
            return "SCISSORS";
        } else {
            return "Invalid Entry";
        }
    }

    @Override
    public String getName() {

        return "Game Player";

    }

}