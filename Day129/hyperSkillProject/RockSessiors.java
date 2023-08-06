package hyperSkillProject;

import java.util.Scanner;

 class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine();

        String computerChoice = "";

        if (userChoice.equals("rock")) {
            computerChoice = "paper";
        } else if (userChoice.equals("paper")) {
            computerChoice = "scissors";
        } else if (userChoice.equals("scissors")) {
            computerChoice = "rock";
        }

        System.out.println("Sorry, but the computer chose " + computerChoice + ".");

        scanner.close();
    }
}