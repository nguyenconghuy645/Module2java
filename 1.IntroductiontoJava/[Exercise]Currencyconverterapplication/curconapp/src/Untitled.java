import java.util.Scanner;

public class Untitled {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("moi ban nhap so tien usd: ");
        usd = scanner.nextDouble();
        double newvnd = usd * vnd;
        System.out.println("gia tri vnd: " + newvnd);
    }
}
