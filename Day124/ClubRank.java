public class ClubRank {
    public static void main(String[] args) {
        String[] players = {"p1", "p2", "p3", "p4", "p5"};
        String newPlayer = "Harper";

        // Find Harper's rank
        int harperRank = findPlayerRank(players, newPlayer);

        System.out.println("Harper's rank: " + harperRank);
    }

    public static int findPlayerRank(String[] players, String player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].equals(player)) {
                return i + 1; // Add 1 to get the actual rank
            }
        }

        return -1; // Player not found
    }
}