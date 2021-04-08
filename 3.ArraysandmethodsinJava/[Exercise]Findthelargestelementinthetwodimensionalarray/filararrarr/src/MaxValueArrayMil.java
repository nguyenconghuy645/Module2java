import java.util.Scanner;

public class MaxValueArrayMil {
    public static void main(String[] args) {
        int column, row;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        column = scanner.nextInt();
        int[][] milArray = new int[row][column];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("milArray[" + i + "]["+ j + "] = ");
                milArray[i][j] = scanner.nextInt();
            }
        }
        int max = milArray[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < milArray[i][j]) {
                    max = milArray[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
