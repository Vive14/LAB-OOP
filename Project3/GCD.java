import java.util.Scanner;

public class GCD {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number1: ");
        int n1 = input.nextInt();

        System.out.print("Enter number2: ");
        int n2 = input.nextInt();

        System.out.print("GCD is " + computeGCD(n1, n2));
    }

    public static int computeGCD(int n1, int n2) {
        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        return gcd;
    }

    
}
