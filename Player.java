import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the class Player where 3 options are displayed in the console.
 * An arraylist for matchHistory that will store matchResult is declared and initialized.
 * The player chooses and inputs 1, 2 or 3 and a scanner saves the input into playerChoice.
 * A getter is used to further use the chosen option in the class MatchLogic.
 * @author JcodeErh
 */
public class Player {
    private ArrayList<String> matchHistory;
    private int playerChoice;       // Stores player choice.

    public Player() {
        this.matchHistory = new ArrayList<>();
    }

    /**
     * The method askChoice displays the players options on the console.
     * Were the options are Sten, Sax, Påse.
     * The player uses an int, either, 1, 2, or 3, to choose either option.
     * The nextLine waits for an input from the player in the console before the code continues.
     */
    public void askChoice(Scanner console) {
        System.out.println("Vad väljer du: 1. Sten 2. Sax 3. Påse");
        System.out.print(": ");
        this.playerChoice = Integer.parseInt(console.nextLine());
        switch (playerChoice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Välj 1, 2 eller 3!");
        }
    }

    /**
     * This method saves the game output into the initialized Array List.
     * Takes in parameters. Sends in string matchResult to Player.
     * And a getter to further use the playerChoice option in MatchLogic.
     */
    public void addToMatchHistory(String matchResult) {
        this.matchHistory.add( matchResult);
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    /**
     * This method prints the game results of all played rounds.
     * Prints history when called from main menu.
     */
    public void printMatchHistory(String matchResult) {

        System.out.println("Historik: ");

        for (int i = 0; i < matchHistory.size(); i++) {
            System.out.println(matchHistory.get(i));
        }
    }
}

