package codewars.a.eight.kyu;

/**
 * Rock Paper Scissors (8kyu)
 * Let's play! You have to return which player won! In case of a draw return Draw!.
 *
 * Examples(Input1, Input2 --> Output):
 *
 * "scissors", "paper" --> "Player 1 won!"
 * "scissors", "rock" --> "Player 2 won!"
 * "paper", "paper" --> "Draw!"

 */
public class RockPaperScissors {
    public String rps(String p1, String p2) {
        switch (p1) {
            case "rock":
                return p2.equals("scissors") ? "Player 1 won!"
                        : p2.equals("paper") ? "Player 2 won!"
                        : "Draw!";
            case "paper":
                return p2.equals("rock") ? "Player 1 won!"
                        : p2.equals("scissors") ? "Player 2 won!"
                        : "Draw!";
            case "scissors":
                return p2.equals("paper") ? "Player 1 won!"
                        : p2.equals("rock") ? "Player 2 won!"
                        : "Draw!";
            default:
                return "";
        }
    }
}
