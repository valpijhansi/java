class LambdaEx {
    
    public static void main(String[] args) {

        Sum res = (a,b) -> {

                System.out.println(a+b);


        };

        res.sum(25,35);
    }
}

interface Sum {
    
    void sum(int a, int b);
}
