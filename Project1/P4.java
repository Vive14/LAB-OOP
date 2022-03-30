import java.util.Scanner;

public class P4 {
 public static void main(String[] args) {
     double w,h, sum;
     Scanner input = new Scanner(System.in);

     System.out.print("Enter weight pounds : ");
     w = input.nextDouble();
     System.out.print("Enter height inches : ");
     h = input.nextDouble();

     sum = ((w * 0.45359237) /((h * 0.0254) * (h * 0.0254) ));
     System.out.print("BMI = "+sum);

     input.close();
 }
    
}