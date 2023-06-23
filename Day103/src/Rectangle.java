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

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

}
