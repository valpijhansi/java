 class Test {
    public static void main(String[] args) {

        Nick nick = new Nick();

        System.out.println(nick.hashCode());
    }
}
class Duck { //  by default it extends the Object class 

}
class Nick extends Duck { // Nick contains properities of both nick & object classes
    
    int x;
    
}