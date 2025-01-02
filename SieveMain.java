import java.util.Scanner;

public class SieveMain {     

    public static void simpleSieve(int limit) {               
        boolean[] prime = new boolean[limit + 1];         
        for (int i = 2; i <= limit; i++) {             
            prime[i] = true;         
        }              

        for (int p = 2; p * p <= limit; p++) {             
            if (prime[p]) {                 
                for (int i = p * p; i <= limit; i += p) {                     
                    prime[i] = false;                 
                }             
            }         
        }              

        for (int p = 2; p <= limit; p++) {             
            if (prime[p]) {                 
                System.out.print(p + " ");             
            }         
        }     
    }         

    public static void main(String[] args) {         
        Scanner scanner = new Scanner(System.in);         
        System.out.print("Enter the limit to find prime numbers: ");         
        int limit = scanner.nextInt();         
        simpleSieve(limit);          
    }     
}