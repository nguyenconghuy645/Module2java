import java.util.TreeMap;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
        double h = 2 * (Math.sqrt(p * (p - this.getSide1()) * (p - this.getSide2()) * (p - this.getSide3()))/this.getSide1());
        double area = (h * this.getSide3()) / 2;
        return area;
    }

    public double getPerimeter() {
        double perimeter =  side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "(" + this.getSide1() + ", " + this.getSide2() + ", " + this.getSide3() + ")" + "\n";
    }
}
