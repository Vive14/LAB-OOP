import java.util.Scanner;

public class Lab2_Pro4_64010451 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = input.nextInt();
        
        if (line < 0 || line > 15) {
            System.out.println("enter an integer from 1 to 15");
            input.close();
            return;
        }
        System.out.println(" ");

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= (line - i) * 2; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) 
            {
                System.out.print(" " + k);
            }
            for (int l = 2; l <= i; l++) 
            {
                System.out.print(" " + l);
            }

            System.out.println("");
        }
        input.close();
    }

}
