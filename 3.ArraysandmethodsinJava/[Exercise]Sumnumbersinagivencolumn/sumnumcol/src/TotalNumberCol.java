import java.util.Scanner;

public class TotalNumberCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập rows: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập cols: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Nhập giá trị: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập số cột muốn tính tổng: ");
        int column = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < rows; i++) {
            total += array[i][column];
        }
        System.out.println("Tổng giá trị của một cột: " + total);
    }
}
