public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "pink", 10.0);
        Circle circle1 = new Circle(10.0, "yellow", 5.0);
        System.out.println("Radius: " + circle.getRadius() + "   Area: " + circle.getArea() + "   Color: " + circle.getColor());
        System.out.println("Radius: " + circle1.getRadius() + "   Area: " + circle1.getArea() + "   Color: " + circle1.getColor());
    }
}
