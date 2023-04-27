enum Size {
    SMALL(), MEDIUM("medium"), LARGE("large", "largeman"), XTRALARGE("xtralarge");

    Size() {
        System.out.println("you have selected");
    }

    Size(String str) {
        System.out.println("you have selected " + str);
    }

    Size(String str, String str1) {
        System.out.println("you have selected " + str);
    }
}

class test {
    public static void main(String args[]) {
        var tShirt = Size.SMALL;
    }
}
