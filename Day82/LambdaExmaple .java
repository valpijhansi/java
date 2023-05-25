 class LambdaExmaple {
    
    public static void main(String[] args) {

        rectangle res = (a,b) -> {

            System.out.println(2*(a+b));

            

        };

        res.rectangle(10,12);
    }
}

interface rectangle {
    
    void rectangle(int a,int b);
}

