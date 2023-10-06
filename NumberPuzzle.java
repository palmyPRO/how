import javax.swing.*;

public class NumberPuzzle {
    public static void main (String[]args){
        do {
            int answer = JOptionPane.showConfirmDialog(null,
                    "Welcome to Number Puzzle Game!\n" +
                            "You have only 10 attempts to solve the puzzle.\n" +
                            "Good luck!", "Number Puzzle Game", JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION) {
                String playerName = JOptionPane.showInputDialog("Enter player name");
                GameEngine.GameEngine(playerName);

            } else {
                break;
            }
        } while (true);
    }
}
