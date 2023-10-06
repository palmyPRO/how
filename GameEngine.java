import javax.swing.*;
public class GameEngine {
    private final int MAX_GUESS_ALLOWED = 10;
    // minimum
    public final int MINIMUM_NUMBER = 1;
    //maximum
    public final int MAXIMUM_NUMBER = 100;
    //com generate 
    public int secretNumber;

    private int generateSecretNumber() {
        int max = MINIMUM_NUMBER;
        int min = MAXIMUM_NUMBER;
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;
        return randomNumber;
    }

    public int guess() {
        String inputStr;
        int num;
        while (true) {
            inputStr = JOptionPane.showInputDialog(null, "Next Guess");
            num = Integer.parseInt(inputStr);
            if (MINIMUM_NUMBER <= num && num <= MAXIMUM_NUMBER) {
                return num;
            }
            // invaild input// error warn
            JOptionPane.showMessageDialog(null, "Invalid Input: " +
                    "Must be between " + MINIMUM_NUMBER + "and  " + MAXIMUM_NUMBER);
        }

        public void GameEngine (String playerName){
            int guessCount = 0;
            int input;
            int secretNumber = generateSecretNumber();

            do {
                input = guess();
                guessCount++;
                if (input < secretNumber) {
                    JOptionPane.showMessageDialog(null, input + " is too LOW");
                } else if (input > secretNumber) {
                    JOptionPane.showMessageDialog(null, input + " is too HIGH");
                }
            } while (guessCount < 10 && input != secretNumber);

            if (input == secretNumber) {
                JOptionPane.showMessageDialog(null, "The secret number is " + secretNumber +
                        "\nCongratulations, " + playerName + "! You are the winner." +
                        "\nYou guessed it in " + guessCount + "/10 tries.");
            } else {
                JOptionPane.showMessageDialog(null, "Oh No! You just lost the game. Please try again...");
            }
            int playAgainAnswer = JOptionPane.showConfirmDialog(null, "Play Another Game?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (playAgainAnswer == JOptionPane.YES_OPTION) {
                generateSecretNumber();
                guessCount = 0;
            } else {
                System.exit(0);
            }

        }
    }
}
