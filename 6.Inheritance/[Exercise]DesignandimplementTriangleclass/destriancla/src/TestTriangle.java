public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20, 30);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
        triangle.setSide1(6);
        triangle.setSide2(4);
        triangle.setSide3(7);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
