import java.util.Scanner;

public class ProgramEnfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double root1;
        double root2;
        if (delta >= 0) {
            root1 = quadraticEquation.getRoot1();
            root2 = quadraticEquation.getRoot2();
            System.out.println("Phương trình có nghiệm root1: " + root1);
            System.out.println("Phương trình có nghiệm root2: " + root2);
        } else if (delta < 0 ) {
            root1 = root2 = 0;
            System.out.println("Phương trình có một nghiệm: " + root1);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
