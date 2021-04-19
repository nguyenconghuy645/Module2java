import java.util.Scanner;
import java.util.Stack;

public class DecBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập số thập phân vào: ");
        int number = scanner.nextInt();
        while (number != 0) {
            int residual = number % 2;
            stack.push(residual);
            number /= 2;
        }
        System.out.println("----------------------------");
        System.out.print("\n Giá trị nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
        System.out.println();

    }
}
