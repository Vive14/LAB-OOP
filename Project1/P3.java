import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value between 0 and 1000 = ");
        int number = input.nextInt();
        int x = 0;
        if ( number < 0 || number > 1000 ) 
        {
          System.out.print("Error");
        }
        else
        {
            x = number %10 + number/10 %10  + number/100; 
            System.out.print("Sum = " + x);
        }
        input.close();
    }
}
