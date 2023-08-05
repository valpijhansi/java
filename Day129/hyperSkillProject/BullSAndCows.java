package hyperSkillProject;

public class BullSAndCows {

    public static void main(String[] args) {
        
        int[] secretCode = {4, 9, 3, 1};

        
        int[][] playerGuesses = {
                {1, 2, 3, 4},
                {3, 6, 7, 8},
                {2,3,4,5,6}
        };


        System.out.println("Welcome to Bulls and Cows game!");
        System.out.println("The secret code consists of 4 unique digits.");
        System.out.println("Try to guess the code by entering a 4-digit number.");

        for (int i = 0; i < playerGuesses.length; i++) {
            int[] guess = playerGuesses[i];
            int bulls = countBulls(secretCode, guess);
            int cows = countCows(secretCode, guess) - bulls;

            System.out.println("\nTurn " + (i + 1) + ":");
            System.out.println("Your guess: " + arrayToString(guess));
            System.out.println("Result: " + bulls + " bull(s) and " + cows + " cow(s).");

            if (bulls == 4) {
                System.out.println("Congratulations! You've guessed the secret code: " + arrayToString(secretCode));
                break;
            }
        }
    }


    private static int countBulls(int[] secret, int[] guess) {
        int bulls = 0;
        for (int i = 0; i < secret.length; i++) {
            if (secret[i] == guess[i]) {
                bulls++;
            }
        }
        return bulls;
    }


    private static int countCows(int[] secret, int[] guess) {
        int cows = 0;
        for (int i = 0; i < secret.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (secret[i] == guess[j] && i != j) {
                    cows++;
                }
            }
        }
        return cows;
    }
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
