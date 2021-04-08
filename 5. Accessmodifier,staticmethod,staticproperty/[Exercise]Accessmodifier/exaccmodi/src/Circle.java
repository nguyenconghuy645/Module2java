public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public Circle() {

    }

    public Circle(double radius, String color, double area) {
        this.radius = radius;
        this.color = color;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }
}
