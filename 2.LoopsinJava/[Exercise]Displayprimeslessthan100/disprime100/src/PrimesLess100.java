import java.util.Scanner;

public class PrimesLess100 {
    public static void main(String[] args) {
        System.out.println("Nhập numbers = ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", numbers);
        if (numbers >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < numbers; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(num);
        for (int i = 2; i <= squareRoot; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
