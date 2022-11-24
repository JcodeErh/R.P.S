import java.util.Random;

/**
 * This is the class Computer that generates a random number between 1 and 3.
 * A getter is used to further use the number in other classes.
 * @author JcodeErh
 */
public class Computer {
    private Random random;
    private int computerChoice;             // Stores generateChoice.

    public Computer() {
        this.random = new Random();         // Constructor for generate random number in generateChoice method.
    }

    public void generateChoice() {          // This method holds a functions that generates a random number.
        this.computerChoice = random.nextInt(3) + 1;

    }

    public int getComputerChoice() {        // Getter for the computers random choice.
        return computerChoice;
    }
}
