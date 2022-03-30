import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        Scanner input = new Scanner(System.in);//การรับข้อมูลจาก keyboart
        System.out.printf("Enter value a = ");
        a = input.nextDouble();
        System.out.printf("Enter value b = ");
        b = input.nextDouble();
        System.out.printf("Enter value c = ");
        c = input.nextDouble();
        System.out.printf("Enter value d = ");
        d = input.nextDouble();
        System.out.printf("Enter value e = ");
        e = input.nextDouble();
        System.out.printf("Enter value f = ");
        f = input.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) 
        {
            System.out.printf("Error a * d - b * c != 0 ");
        }
        else
        {
            System.out.println("Value X = " +x );
            System.out.println("Value Y = " +y);
        }
        input.close();

    }
    


}   
