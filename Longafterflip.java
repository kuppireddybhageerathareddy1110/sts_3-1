import java.util.Scanner;

public class Longafterflip {
    public static int longestConsecutiveOnes(int n) {
        String binary = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;
        int previousLength = 0;

        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength + previousLength + 1);
                previousLength = currentLength;
                currentLength = 0;
            }
        }
        
        maxLength = Math.max(maxLength, currentLength + previousLength + 1);
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();  // User input
        System.out.println("Longest consecutive 1's after flipping a 0: " + longestConsecutiveOnes(n));
        scanner.close();
    }
}