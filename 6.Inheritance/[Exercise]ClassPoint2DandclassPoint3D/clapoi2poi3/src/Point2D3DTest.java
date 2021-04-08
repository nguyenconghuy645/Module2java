public class Point2D3DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D);
        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        point2D.setX(3);
        point2D.setY(4);
        System.out.println(point2D);
        System.out.println("x is: " + point2D.getX());
        System.out.println("y is: " + point2D.getY());
        Point3D point3D = new Point3D(11, 12, 13);
        System.out.println(point3D);
        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        point3D.setX(21);
        point3D.setY(22);
        point3D.setZ(23);
        System.out.println(point3D);
        System.out.println("x is: " + point3D.getX());
        System.out.println("y is: " + point3D.getY());
        System.out.println("z is: " + point3D.getZ());
    }
}
