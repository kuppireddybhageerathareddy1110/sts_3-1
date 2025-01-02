import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of doors: ");
        int n = sc.nextInt();

        boolean[] doors = new boolean[n + 1]; // Default is false (closed)
        int openCount = 0, closedCount = 0;

        // Toggling doors
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) { // Toggle multiples of i
                doors[j] = !doors[j];
            }
        }

        // Counting open and closed doors
        for (int i = 1; i <= n; i++) {
            if (doors[i]) {
                openCount++;
            } else {
                closedCount++;
            }
        }

        System.out.println("Number of doors open: " + openCount);
        System.out.println("Number of doors closed: " + closedCount);

        sc.close();
    }
}