import java.io.*;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productId = scanner.nextLine();
        String productName = scanner.nextLine();
        String productManufacturer = scanner.nextLine();
        int productPrice = scanner.nextInt();
        String productOtherDescription = scanner.nextLine();
        ProductFile productFile = new ProductFile(productId, productName, productManufacturer, productPrice, productOtherDescription);
        String id = productFile.getProductId();
        String name = productFile.getProductName();
        String manufacturer = productFile.getProductManufacturer();
        int price = productFile.getProductPrice();
        String otherDescription = productFile.getProductOtherDescription();
        productFile.printProduct();
    }
}
