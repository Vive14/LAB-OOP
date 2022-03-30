import java.util.Scanner;

public class Lab7_2_Pro1_64010451 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double side1, side2, side3;
        String nameColor;
        boolean filled;
        while (true) {
            
            System.out.print("Enter side1 : ");
            side1 = input.nextDouble();
    
            System.out.print("Enter side2 : ");
            side2 = input.nextDouble();
    
            System.out.print("Enter side3 : ");
            side3 = input.nextDouble();
            if (side1 > 0 && side2 > 0 && side3 > 0) break;
			System.out.println("ERROR: invalid inputs");
        }

        System.out.print("Enter Color : ");
        nameColor = input.next();

        System.out.print("Enter true or false : ");
        filled = input.nextBoolean();

        Triangle t = new Triangle(side1, side2, side3, nameColor, filled);

        t.display();
        System.out.println(t);
        System.out.println("");

    }
}
