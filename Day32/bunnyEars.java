//if there are N bunnies oddNumber bunnies have 2 ears & evenNumber bunnies have 3 ears 
//find total no.of ears
class bunnyEars {
    public static void main(String args[]) {
        int bunnies = 2;
        System.out.println(BunnyEars(bunnies));

    }

    static int BunnyEars(int bunnies) {
        if (bunnies == 0)
            return 0;
        if (bunnies % 2 == 0)
            return 2 + BunnyEars(bunnies + 1);
        else
            return 3 + BunnyEars(bunnies + 1);
    }

}