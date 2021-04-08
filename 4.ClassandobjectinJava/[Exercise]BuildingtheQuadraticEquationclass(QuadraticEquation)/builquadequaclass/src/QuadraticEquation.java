public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(double Aa) {
        return Aa;
    }
    public double getB(double Bb) {
        return Bb;
    }
    public double getC(double Cc) {
        return Cc;
    }
    double delta;
    public double getDiscriminant() {
        return delta = Math.pow(b, 2) - 4 * a * c;
    }
    double r1;
    public double getRoot1() {
        return r1 = (-b + Math.pow(delta,0.5))/(2*a);
    }
    double r2;
    public double getRoot2() {
        return r2 = (-b - Math.pow(delta,0.5))/(2*a);
    }
}
