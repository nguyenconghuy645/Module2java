public class LazyPrimeFactorization implements Runnable {
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int root = number / 2;
        for (int i = 2; i <= root; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        } finally {
            System.out.println("Số nguyên tố.");
        }
    }
}
