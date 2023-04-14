class Ananymous {
    public static void main(String[] args) {
        CitrusFruit c = new CitrusFruit() {
            public void orange() {
                System.out.println("it is citrus fruit");

            }
        };
        c. orange();

    }
}

class CitrusFruit {
    public void orange() {
        System.out.println("it is citrus fruit");

    }
}
