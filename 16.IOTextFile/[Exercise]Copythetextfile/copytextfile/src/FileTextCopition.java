import java.io.*;

public class FileTextCopition {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            File file;
            inputStream = new FileInputStream(new File("E:\\Codegym\\Time\\C0221H1\\Báo cáo tuần\\[CodeGym]_BC_C0221H1_Nguyễn_Công_Huy_1-3-2021.docx"));
            outputStream = new FileOutputStream(new File("E:\\Codegym\\Time\\C0221H1\\Báo cáo tuần\\[CodeGym]_BC_C0221H1_Nguyễn_Công_Huy_8-3-2021.docx"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
