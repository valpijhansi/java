class leaves {
    String name;
    int size;
    String shape;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public String toString() {
        return "leaves [name=" + name + ", size=" + size + ", shape=" + shape + "]";
    }

}