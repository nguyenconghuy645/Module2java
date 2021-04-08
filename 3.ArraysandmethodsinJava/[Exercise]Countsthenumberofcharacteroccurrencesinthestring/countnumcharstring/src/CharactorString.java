public class CharactorString {
    public static void main(String[] args) {
        String name = "Bae Joo Hyun";
        char character = 'o';
        int count = 0;
        int i = 0;
        while (i < name.length()) {
            if (character == name.charAt(i)) {
                count++;
            }
            i++;
        }
        System.out.println("Số lần ký tự xuất hiện: " + count);
    }
}
