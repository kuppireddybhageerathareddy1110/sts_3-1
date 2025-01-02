import java.util.Scanner;

public class KaratsubaMultiplication {

    public static long karatsubaMultiply(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (n + 1) / 2;

        long a = x / (long) Math.pow(10, half);
        long b = x % (long) Math.pow(10, half);
        long c = y / (long) Math.pow(10, half);
        long d = y % (long) Math.pow(10, half);

        long ac = karatsubaMultiply(a, c);
        long bd = karatsubaMultiply(b, d);
        long adbc = karatsubaMultiply(a + b, c + d) - ac - bd;

        return (long) (ac * Math.pow(10, 2 * half) + adbc * Math.pow(10, half) + bd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for x and y
        System.out.print("Enter the first number (x): ");
        long x = sc.nextLong();
        System.out.print("Enter the second number (y): ");
        long y = sc.nextLong();

        // Calculating the product using Karatsuba multiplication
        long product = karatsubaMultiply(x, y);

        // Displaying the result
        System.out.println("Product: " + product);

        // Closing the scanner
        sc.close();
    }
}