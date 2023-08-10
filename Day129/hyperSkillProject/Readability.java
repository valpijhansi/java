import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readability {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ARIAnalyzer <filename>");
            return;
        }

        String fileName = args[0];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            reader.close();

            int characters = content.toString().replaceAll("[ \n\t]", "").length();
            int words = content.toString().split("\\s+").length;
            int sentences = content.toString().split("[.!?]").length;

            double score = 4.71 * (characters / (double) words) + 0.5 * (words / (double) sentences) - 21.43;
            int roundedScore = (int) Math.round(score);

            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Sentences: " + sentences);
            System.out.println("ARI Score: " + roundedScore);

            if (roundedScore >= 1 && roundedScore <= 14) {
                int age = getAgeBracket(roundedScore);
                System.out.println("Approximate Age: " + age);
            } else if (roundedScore > 14) {
                System.out.println("Approximate Age: 24+");
            } else {
                System.out.println("Invalid ARI score.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getAgeBracket(int score) {
        int[] ageRanges = { 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 24 };
        return ageRanges[score - 1];
    }
}
