import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    private static String getContentFrom(String link) throws IOException {
        // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
        URL url = new URL(link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\\\R", "");
        return content;
    }

    public static void main(String[] args) throws IOException {
        try {
//            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
//            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z");
//            String content = scanner.next();
//            scanner.close();
//            content = content.replaceAll("\\+", "");
            String content = getContentFrom("https://dantri.com.vn/the-gioi.htm");
            Pattern pattern = Pattern.compile("<div class='dropdown__content'><ol><li>(.*?)");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
