
//finding no.of words in a given String
class Numwords {
    public static void main(String args[]) {
        String str = "Being alone is the best  thing";
        int words = 0;
        for (var x : str.toCharArray()) {
            if (x == ' ')
                words++;
        }
        String x[] = str.split("\\s+");
        System.out.println(words + 1);

        System.out.print(x[4]);
    }
}
