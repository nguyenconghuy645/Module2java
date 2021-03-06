import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream =null;
        try {
            inputStream = new FileInputStream(source);
            File file;
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.printf("Enter destination file: ");
        String desPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(desPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioException) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioException.getMessage());
        }
    }
}
