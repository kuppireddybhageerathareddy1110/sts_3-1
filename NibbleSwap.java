import java.util.Scanner;

public class NibbleSwap {
    public static byte swapNibbles(byte b) {
        // Extract the upper and lower nibbles
        byte upperNibble = (byte) ((b & 0xF0) >>> 4);  // Shift the upper nibble to lower 4 bits
        byte lowerNibble = (byte) (b & 0x0F);  // Keep the lower 4 bits
        
        // Shift the nibbles and combine them
        byte swappedByte = (byte) ((lowerNibble << 4) | upperNibble);  // Swap the nibbles
        
        return swappedByte;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input a byte value (in hexadecimal format)
        System.out.println("Enter a byte value in hexadecimal (e.g., AB): ");
        String input = scanner.nextLine();
        
        // Parse the input as a byte
        byte byteValue = (byte) Integer.parseInt(input, 16);
        
        // Swap the nibbles
        byte swappedByte = swapNibbles(byteValue);

        // Output the result
        System.out.println("Original byte: " + Integer.toBinaryString(byteValue & 0xFF));
        System.out.println("Swapped byte: " + Integer.toBinaryString(swappedByte & 0xFF));
        
        scanner.close();  // Close the scanner
    }
}