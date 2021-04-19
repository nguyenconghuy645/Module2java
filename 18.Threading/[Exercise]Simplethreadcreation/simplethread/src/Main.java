public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator1);

        thread1.run();
        thread2.run();
    }
}
