enum TShirtSize {
    small(), medium("rock"), large("nick", "buck"), XtraLarge;

    TShirtSize() {
        System.out.println("Default man");//in this case small,xtraLarge do not have parameters then these are comes under empty constructor
    }

    TShirtSize(String str) {
        System.out.println("medium");
    }

    TShirtSize(String str, String str1) {
        System.out.println(str + "   " + str1);
    }
}

class enumConstructor {
    public static void main(String args[]) {
        var tShirt = TShirtSize.large;
    }
}
