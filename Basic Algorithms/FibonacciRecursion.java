public class FibonacciRecursion {
    public static void main(String[] args) {
        int x = 20;
        for (int i = 1; i <= x; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
