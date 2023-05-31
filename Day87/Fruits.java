class Fruits {
    String name;
    int quantity;
    String Quality;
    String nature;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getQuality() {
        return Quality;
    }
    public void setQuality(String quality) {
        Quality = quality;
    }
    public String getNature() {
        return nature;
    }
    public void setNature(String nature) {
        this.nature = nature;
    }
    
    @Override
    public String toString() {
        return "Fruits [name=" + name + ", quantity=" + quantity + ", Quality=" + Quality + ", nature=" + nature + "]";
    }
}