public class OwnRunTimeException  {
    public static void main(String[] args) {
        human h = new human();
        try {
            h.setGender("mAle");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class human {
    private String gender;
    public String getGender() {
        return gender();
    }

    private String gender() {
        return gender;
    }

    public void setGender(String gender) throws IllegalArgumentException {
//        String s = gender.toLowerCase();
//        if(!(s.equals("male")||s.equals("female")))
//            throw new IllegalArgumentException("mention valid gender");
//        this.gender = gender;
    }


}
class IllegalGenderException extends Exception{
    public IllegalGenderException(String s) {
        super(s);
    }
}



