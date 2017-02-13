import java.util.Random;


public class Player2 extends Player {


    @Override
    public String generateRoshambo(String input) {

        Random play = new Random();
        int output = play.nextInt(4);
        if (output == 1) {
            return ("Rock");
        } else if (output == 2) {
            return ("Paper");
        } else {
            return ("Scissors");
        }
    }

    @Override
    public String getName() {

        return "Phillip";
    }


}

