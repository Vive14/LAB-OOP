import java.util.Scanner;

public class testP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = input.nextInt();
        System.out.println(" ");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println("");
            input.close();
        }
    }
}
