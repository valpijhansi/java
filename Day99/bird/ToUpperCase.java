import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToUpperCase {
    public static void main(String[] args) {
        String inputFile = "rock.txt";
        String outputFile = "rock.txt";

        try {
            // Open the input and output streams
            FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            // Read the input file character by character and write the uppercase version to the output file
            int character;
            while ((character = inputStream.read()) != -1) {
                char upperCaseChar = Character.toUpperCase((char) character);
                outputStream.write(upperCaseChar);
            }

            // Close the streams
            inputStream.close();
            outputStream.close();

            System.out.println("File converted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}