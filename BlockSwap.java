import java.util.Scanner;

public class BlockSwap {
    static void leftRotate(int arr[], int d, int n) {
        int i, j;
        if (d == 0 || d == n)
            return;
        // If number of elements to be rotated is more than array size
        if (d > n)
            d = d % n;
        i = d;
        j = n - d;
        while (i != j) {
            if (i < j) { // A is shorter
                swap(arr, d - i, d + j - i, i);
                j -= i;
            } else { // B is shorter
                swap(arr, d - i, d, j);
                i -= j;
            }
        }
        // Finally, block swap A and B
        swap(arr, d - i, d, i);
    }

    // Utility function to print an array
    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // This function swaps d elements starting at index fi with d elements starting at index si
    public static void swap(int arr[], int fi, int si, int d) {
        int temp;
        for (int i = 0; i < d; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number of rotations
        System.out.println("Enter the number of positions to rotate:");
        int d = scanner.nextInt();

        // Perform the left rotation
        leftRotate(arr, d, n);

        // Print the rotated array
        System.out.println("Rotated Array:");
        printArray(arr, n);

        scanner.close();
    }
}