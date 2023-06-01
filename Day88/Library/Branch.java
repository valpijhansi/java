package Library;

public class Branch {
 
    String name;
    String code;
    String typeOfBooks;
    int numOfBooks;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
   
    public String getTypeOfBooks() {
        return typeOfBooks;
    }
    public void setTypeOfBooks(String typeOfBooks) {
        this.typeOfBooks = typeOfBooks;
    }
    public int getNumOfBooks() {
        return numOfBooks;
    }
    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }
    
    @Override
    public String toString() {
        return "Branch [name=" + name + ", code=" + code + ", typeOfBooks=" + typeOfBooks + ", numOfBooks=" + numOfBooks
                + "]";
    }
}
