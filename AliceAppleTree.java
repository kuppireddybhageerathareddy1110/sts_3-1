import java.util.Scanner;

public class AliceAppleTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of apples: ");
        int apple = sc.nextInt();
        int cnt = 0, sum = 0;

        while (sum < apple) {
            cnt++;
            sum += (12 * cnt * cnt);
        }

        System.out.println("Size of the tree: " + (8 * cnt));

        sc.close();
    }
}