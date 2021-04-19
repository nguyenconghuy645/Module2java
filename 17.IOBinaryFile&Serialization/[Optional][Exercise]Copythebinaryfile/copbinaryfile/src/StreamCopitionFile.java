import java.io.*;

public class StreamCopitionFile {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("E:\\Codegym\\Time\\C0221H1\\Báo cáo tuần\\[CodeGym]_BC_C0221H1_Nguyễn_Công_Huy_1-3-2021.docx"));
            outStream = new FileOutputStream(new File("E:\\Codegym\\Time\\C0221H1\\Báo cáo tuần\\[CodeGym]_BC_C0221H1_Nguyễn_Công_Huy_8-3-2021.docx"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
