import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for a and b
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Function call
        int g = gcd(a, b);

        // Output the GCD
        System.out.println("GCD(" + a + " , " + b + ") = " + g);

        // Closing the scanner
        sc.close();
    }
}