enum fruits {
    small, medium, large;
};

class fruitSize {
    public static void main(String args[]) {
        for (fruits f : fruits.values()) {
            System.out.println(f);
        }
    }
}

class rock {
    fruits f = fruits.medium;
}