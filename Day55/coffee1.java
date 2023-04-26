enum coffee1 {
    small,
    medium,
    large;
};

class ECoffee {
    public static void main(String args[]) {
        coffee1 c1 = coffee1.large;
        switch (c1) {
            case small:
                System.out.print("you ordered a small cup of coffee");
                break;
            case medium:
                System.out.print("you ordered a medium cup of coffee");
                break;
            default:
                System.out.print("invalid size please select a valid size");

        }
    }
}