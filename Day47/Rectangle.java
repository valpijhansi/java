//data can be hide with the use of access modifier as private
//we can encapsulate class in java by making all the data members of the class private.
class rectangle {
    public static void main(String args[]) {
        rect r = new rect();
        r.setLength(10);
        r.setBreadth(20);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }

}

class rect {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        length = l;
    }
 
    public int  getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

}