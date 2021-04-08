public class PointMoveAbleTest {
    public static void main(String[] args) {
        Point point = new Point(20, 30);
        System.out.println(point.toString());
        point.setXY(10, 20);
        System.out.println(point.toString());
        point = new MoveablePoint(point.getX(), point.getY(), 10, 20);
        System.out.println(point.toString());
        ((MoveablePoint) point).move();
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint(20, 20);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
