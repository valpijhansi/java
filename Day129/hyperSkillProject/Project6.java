package hyperSkillProject;



import java.util.Scanner;

class ChuckNorrisCipherEncoder {
    static Scanner scanner = new Scanner(System.in);

    public static void encodeString() {

        System.out.println("Input string:");
        String str = scanner.nextLine();

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String binaryRepresentation = String.format("%7s", Integer.toBinaryString(c)).replace(' ', '0');

            res += binaryRepresentation;

        }

        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        for (; i < res.length(); i++) {

            if (res.charAt(i) == '1') {
                int count = 0;
                int j = i;
                for (; j < res.length(); j++) {
                    if (res.charAt(j) == '1') {
                        count++;
                    } else {
                        break;
                    }
                }
                i = (j - 1);
                stringBuilder.append("0" + " ");
                for (int k = 0; k < count; k++) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(" ");
            } else {
                int count = 0;
                int j = i;
                for (; j < res.length(); j++) {
                    if (res.charAt(j) == '0') {
                        count++;
                    } else {

                        break;
                    }
                }
                i = (j - 1);
                stringBuilder.append("00" + " ");
                for (int k = 0; k < count; k++) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(" ");
            }

        }

        System.out.println("Encoded string:");
        System.out.println(stringBuilder);

    }

    public static void decodedString() {

        System.out.println("Input encoded string:");
        String str = scanner.nextLine();

        for (char c : str.toCharArray()) {
            if (c != '0' && c != ' ') {
                System.out.println("Encoded string is not valid.");
                return;
            }
        }

        String res="";
        res += str;
        String[] words = res.split("\\s+");
        if(words.length%2!=0) {
            System.out.println("Encoded string is not valid.");
            return;
        }
        for(int i=0;i<words.length;i++){
            if(i%2==0) {
                if(words[i].length()>2) {
                    System.out.println("Encoded string is not valid.");
                    return;
                }
            }
        }

        String binaryResult = extractBinaryResult(str);
        if(binaryResult.length()%7!=0) {
            System.out.println("Encoded string is not valid.");
            return;
        }
        String binaryBlocks = splitBinaryIntoBlocks(binaryResult);
        String decodedResult = convertBinaryToCharacters(binaryBlocks);

        System.out.println("Decoded string:");
        System.out.println(decodedResult);
    }


    private static String extractBinaryResult(String str) {

        StringBuilder stringBuilder1 = new StringBuilder();
        int j = 0;
        while (j < str.length()) {
            if (str.startsWith("0 ", j)) {
                int count = 0;
                int k = (j + 2);
                while (k < str.length() && str.charAt(k) != ' ') {
                    count++;
                    k++;
                }
                j = k;
                for (int l = 0; l < count; l++) {
                    stringBuilder1.append("1");
                }
            } else if (str.startsWith("00 ", j)) {
                int count = 0;
                int k = (j + 3);
                while (k < str.length() && str.charAt(k) != ' ') {
                    count++;
                    k++;
                }
                j = k;
                for (int l = 0; l < count; l++) {
                    stringBuilder1.append("0");
                }
            } else {
                j++;
            }
        }
        return stringBuilder1.toString();
    }

    private static String splitBinaryIntoBlocks(String binaryResult) {

        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < binaryResult.length(); i += 7) {
            String block = binaryResult.substring(i, Math.min(i + 7, binaryResult.length()));
            stringBuilder2.append(block).append(" ");
        }

        return stringBuilder2.toString();
    }

    private static String convertBinaryToCharacters(String binaryBlocks) {

        StringBuilder stringBuilder3 = new StringBuilder();
        String[] blocks = binaryBlocks.trim().split(" ");

        for (String block : blocks) {
            int decimalValue = Integer.parseInt(block, 2);
            char character = (char) decimalValue;
            stringBuilder3.append(character);
        }

        return stringBuilder3.toString();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please input case number:");
            System.out.println("1.encode");
            System.out.println("2.decode");
            System.out.println("3.exit");
            int  option = scanner.nextInt();

            switch (option) {
                case 1:
                        ChuckNorrisCipherEncoder.encodeString();
                        break;
                case 2:
                    ChuckNorrisCipherEncoder.decodedString();
                         break;
                case 3:
                    System.out.println("exit from the operation");
                    break;


                default:
                    System.out.println("Invalid Option");
            }

        }

    }

}

