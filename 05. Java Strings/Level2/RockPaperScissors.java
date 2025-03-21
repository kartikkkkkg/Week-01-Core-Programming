import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int) (Math.random() * 3)];
    }

    public static String determineWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStatistics(int userWins, int computerWins, int total) {
        return new String[][] {
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"User Win %", String.format("%.2f", (userWins * 100.0 / total)) + "%"}
        };
    }

    public static void displayResults(String[][] stats) {
        for (String[] row : stats) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        scanner.nextLine();
        int userWins = 0, computerWins = 0;
        try {
            if (games <= 0) throw new IllegalArgumentException("Number of games must be positive");
            for (int i = 0; i < games; i++) {
                System.out.print("Enter choice (Rock/Paper/Scissors): ");
                String user = scanner.nextLine();
                if (!user.equalsIgnoreCase("Rock") && !user.equalsIgnoreCase("Paper") && !user.equalsIgnoreCase("Scissors")) {
                    throw new IllegalArgumentException("Invalid choice");
                }
                String computer = getComputerChoice();
                String winner = determineWinner(user, computer);
                if (winner.equals("User")) userWins++;
                else if (winner.equals("Computer")) computerWins++;
                System.out.println("User: " + user + ", Computer: " + computer + ", Winner: " + winner);
            }
            displayResults(calculateStatistics(userWins, computerWins, games));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}