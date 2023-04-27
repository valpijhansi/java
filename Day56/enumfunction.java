enum size {
    SMALL(), MEDIUM("medium"), LARGE("large", "largeman"), XTRALARGE("xtralarge");

    size() {
        System.out.println("you have selected");
    }

    size(String str) {
        System.out.println("you have selected " + str);
    }

    size(String str, String str1) {
        System.out.println("you have selected " + str);
    }

    int res;

    int print() {
        System.out.println("honesty is the best");
        this.res = 12;
        return res;
    }
}

class enumfunction {
    public static void main(String args[]) {
        var tShirt = size.SMALL;
        tShirt.print();
        // var tshirt = size.LARGE.print(); we can also call method like in enum Concept
        // System.out.print(tshirt);
    }
}
