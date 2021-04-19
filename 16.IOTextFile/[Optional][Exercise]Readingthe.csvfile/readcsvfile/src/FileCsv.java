import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCsv {
    public static void main(String[] args) {
        String line;
        try (BufferedReader br = new BufferedReader(
                new FileReader("E:\\country.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] split = line.split(", ");
                System.out.println("\nLength: " + split.length);
                System.out.println("split[0]: " + split[0]);
                System.out.println("split[1]: " + split[1]);
                System.out.println("split[2]: " + split[2]);
                System.out.println("split[3]: " + split[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
