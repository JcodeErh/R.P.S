/**
 * This is the class MatchLogic where we compare the playersChoice to the computersChoice
 * in order to get the outcome of the game and print the players result.
 * @author JcodeErh
 */
public class MatchLogic {
    public String matchResult;
    /**
     * This method takes in a player and computer.
     * Takes in parameters.
     */
    public void decideWinner(Player player, Computer computer){

        // Converts computerChoice to a string.
        String cpuChoice;
        String Sten = "Sten";
        String Sax = "Sax";
        String Påse = "Påse";

        if (computer.getComputerChoice() == 1) {
            cpuChoice = Sten;
        } else if (computer.getComputerChoice() == 2) {
            cpuChoice = Sax;
        } else {
            cpuChoice = Påse; }


        // Compares the options and gets a result.
        if(player.getPlayerChoice() == (computer.getComputerChoice()))  {
        matchResult = "Oavgjort";
        player.addToMatchHistory(matchResult);
            System.out.println("Datorn valde samma som du!");
           System.out.println("Oavgjort.");
        } else if( (player.getPlayerChoice() == 1 &&
                computer.getComputerChoice() == 2) ||
                (player.getPlayerChoice() == 2 && computer.getComputerChoice() == 3 ) ||
                (player.getPlayerChoice() == 3 && computer.getComputerChoice() == 1)) {
        matchResult = "Du vann";
        player.addToMatchHistory(matchResult);
            System.out.println("Datorn valde: " + cpuChoice);
         System.out.println("Du vann!");
        } else {
         matchResult = "Du förlorade";
         player.addToMatchHistory(matchResult);
            System.out.println("Datorn valde: " + cpuChoice);
          System.out.println("Du förlorade :(");
        }
    }
}
