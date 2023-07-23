class flipkart {
    flipkart(){
        System.out.println("empty");
    }
    flipkart(double price) {
        this(23);
        System.out.println("product name");
    }
    flipkart(String name,int quantity ){
        this();
        System.out.println("price");
    }
    flipkart(int age){
        this("Hari",28);
        System.out.println("char");
    }

    public static void main(String[] args) {
        flipkart fp = new flipkart(20.5);
    }
}

