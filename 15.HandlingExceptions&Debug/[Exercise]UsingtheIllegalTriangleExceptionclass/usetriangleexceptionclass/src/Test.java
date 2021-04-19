import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        Triangle triangle = null;
        try {
            triangle = new Triangle(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
