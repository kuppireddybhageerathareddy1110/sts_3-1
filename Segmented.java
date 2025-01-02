import java.util.Scanner;

public class Segmented {
    static void SegSieve(int l, int h) {
        boolean[] prime = new boolean[h - l + 1];
        for (int p = 2; p * p <= h; p++) {
            int sm = (l / p) * p;
            if (sm < l) {
                sm += p;
            }
            if (sm == p) {
                sm += p;
            }
            for (int i = sm; i <= h; i += p) {
                prime[i - l] = true;
            }
        }
        for (int i = l; i <= h; i++) {
            if (i > 1 && !prime[i - l]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit (l): ");
        int l = scanner.nextInt();
        System.out.print("Enter the upper limit (h): ");
        int h = scanner.nextInt();
        System.out.println("Prime numbers in the range [" + l + ", " + h + "]:");
        SegSieve(l, h);
    }
}