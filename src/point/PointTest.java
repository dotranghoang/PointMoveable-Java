package point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(4.4 , 9.2);
        System.out.println(point);
        point.setX(2.9);
        point.setY(3.6);
        System.out.println(point);
        point.setXY(2.1 , 3.2);
        System.out.println(point);
    }
}
