import java.util.Scanner;

public class TotalSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        System.out.println("Nhập giá trị: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += array[i][i];
        }
        System.out.println("Tổng đường chéo chính: " + total);
    }
}
