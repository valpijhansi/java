import java.awt.*;

public class RefactoringCode {
    public static void main(String[] args) {
        Point p = new Point(5,8);
        int r = findArea(p,20);
        System.out.println(r);
    }
    public static  int findArea(Point p, int radius) {
        return p.x * p.y * radius;
    }
}
