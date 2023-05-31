import java.util.Arrays;

class Trees{
    public static void main(String args[]) {
        Forest f = new Forest();
        f.setName("Turahalli");
        f.setArea(900);
        f.setType("dry and deciduous");
        f.setPurpose("improving working cricle");
        Forest f1 = new Forest();
        f1.setName("Nallamala");
        f1.setArea(3568);
        f1.setType("deciduous");
        f1.setPurpose("provides medicinal plants");

        Fruits ft = new Fruits();
        ft.setName("Apple");
        ft.setNature("edible domestica");
        ft.setQuality("Good");
        ft.setQuantity(200);

        Fruits ft1 = new Fruits();
        ft.setName("banana");
        ft.setNature("edible  friut");
        ft.setQuality("Good source in  vitamin C");
        ft.setQuantity(20);

        Fruits[] fruit = {ft,ft1};
        f1.setFruits(fruit);

        leaves l = new leaves();
        l.setName("mangifera indica");
        l.setName("oblong-elliptic to lanceolate");
        l.setSize(7);
        
        leaves l1 = new leaves();
        l.setName("Azardirachta indica");
        l.setShape("elongated to oblong");
        l.setSize(40);

        leaves[] leaf = {l,l1};
        f1.setLeaves(leaf);

        System.out.println(f1);
        System.out.println(f);



    }
}
class Forest {
    String name;
    String type;
    String purpose;
    int area;
    private Fruits[] fruit;
    private leaves[] leaf;
    public String getName() {
        return name;
    }
    public void setLeaves(leaves[] leaf) {
        this.leaf = leaf;
    }
    public void setFruits(Fruits[] fruit) {
        this.fruit = fruit;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return "Forest [name=" + name + ", type=" + type + ", purpose=" + purpose + ", fruit=" + Arrays.toString(fruit)
                + ", leaf=" + Arrays.toString(leaf) + ", area=" + area + "]";
    }
}