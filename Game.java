import java.util.Scanner;

/**
 * This is the Game class that has constructor for objects, runs the actual game,
 * and holds two menus both with three options for the player which is displayed on the console.
 * The 3 choices leads to other classes, or quits the program.
 * The user chooses one of 3 choices by typing in 1, 2, or 3.
 * @author JcodeErh
 */
public class Game {
    private Player player;
    private Computer computer;
    private MatchLogic matchLogic;
    private Scanner console;
    private boolean exitGame = false;

    public Game(){
        this.player = new Player();
        this.computer = new Computer();
        this.matchLogic = new MatchLogic();
        this.console = new Scanner(System.in);
        showMenu();
    }

    /**
     * The method showMenu displays the Main Menu on the console.
     * Showing the main menu options and can either run the game (by calling playMatch),
     * print rounds history, or quit the program, depending on which option is chosen.
     */
    public void showMenu(){             // Starts the program by showing a menu.
        System.out.println("<Huvudmeny>");
        System.out.println(" 1.Ny Match\t2.Historik \t3.Avsluta spelet");
        System.out.println(": ");
        int option = Integer.parseInt( console.nextLine() );
        switch (option){
            case 1:
                playMatch();
                if( !exitGame )  // Om exit game inte är sant, kör vi showMenu.
                    showMenu(); // Recursion.
                break;
            case 2:
                player.printMatchHistory(matchLogic.matchResult);   // Prints the players game rounds history.
                showMenu(); // Recursion.
                break;
            case 3:
                System.out.println("Avslutat");
                break;
            default:
                System.out.println("Ogiltigt val");
                showMenu(); // Recursion, making a function call itself.
        }
    }

    /**
     * The method playMatch sets the functions for the innings of the actual game.
     * The main code for the game starts here.
     * Initializes the generateChoice method and askChoice for player.
     * The AfterMatch menu is then displayed after playMatch is done.
     */
    public void playMatch(){
        computer.generateChoice();      // skaffar ett nytt val och lagrar i sig själva.
        player.askChoice(console);      // skaffar ett nytt val och lagrar i sig själva.
        matchLogic.decideWinner(player, computer);  // skicka player och computer till matchLogic som sköter decide winner.
        afterMenu();                    // recursion
    }

    /**
     * The method afterMenu displays the second menu, After Match Menu, on the console.
     * Were the options are go to the main menu, play the game, or end the program.
     * If one chooses to end the program, a message is printed that the program has ended.
     */
    public void afterMenu(){
        System.out.println("<After Match Menu>");
        System.out.println(" 1.Huvudmeny \t2.Spela igen \t3.Avsluta spelet");
        int option = Integer.parseInt( console.nextLine() );
        switch (option){
            case 1:
                break;
            case 2:
                playMatch();
                break;
            case 3:
                System.out.println("Avslutat spelet!");
                exitGame = true;
                break;
            default:
                System.out.println("Ogiltigt val");
                afterMenu();
        }
    }
}
