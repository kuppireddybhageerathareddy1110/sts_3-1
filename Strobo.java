import java.util.Scanner;

public class Strobo {

    static boolean isStrobogrammatic(String num) {
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            char left = num.charAt(l);
            char right = num.charAt(r);

            if (left == '6' && right != '9') return false;
            if (left == '9' && right != '6') return false;
            if (left == '0' && right != '0') return false;
            if (left == '1' && right != '1') return false;
            if (left == '8' && right != '8') return false;
            if (left != '6' && left != '9' && left != '0' && left != '1' && left != '8') return false;
            
            l++;
            r--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give num: ");
        String n = sc.next();
        System.out.println(isStrobogrammatic(n));
    }
}