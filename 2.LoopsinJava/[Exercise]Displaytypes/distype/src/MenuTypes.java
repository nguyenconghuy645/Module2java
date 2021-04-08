import java.util.Scanner;

public class MenuTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. rectangular printing");
            System.out.println("2. Prints a right-angled triangle at botton-left");
            System.out.println("3. Prints a right triangle, with a right-angled top-left");
            System.out.println("4. Print an isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("rectangular printing");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(" ");
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Prints a right-angled triangle at botton-left");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Prints a right triangle, with a right-angled top-left");
                    for (int i = 7; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Print an isosceles triangle");
                    int height = 5;
                    for(int i = 1; i <= height; i++) {
                        for(int j = 1; j <= height-i; j++) {
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= 2*i-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
