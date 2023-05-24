class IsBlank{
    public static void main(String[] args) {

        String first = "  ";

        String last="hello";

        if(first.isEmpty()||first.isBlank()) { // true, first String contains whitespaces

            first="say"; 

            System.out.println(first+" "+last);
        }
        
        String str ="";

        System.out.println(str.isBlank()); // returns true, str String is empty
    }
}

 //The isBlank() method will return true in two cases:

    //    If the string is empty.

        //If the string only contains whitespaces.