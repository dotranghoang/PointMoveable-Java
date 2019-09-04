package point;

public class PointMoveTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2.0 , 2.0 , 3.0 , 4.0);
        System.out.println(moveablePoint);
        moveablePoint.setXSpeed(1.0);
        moveablePoint.setYSpeed(1.0);
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(3.0 ,3.0);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(20.5 , 25.5);
        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
