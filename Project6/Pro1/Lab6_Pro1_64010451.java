import java.util.Scanner;

public class Lab6_Pro1_64010451 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter name and age: ");
        String[] nameAge = input.nextLine().split(" ");
        String name = nameAge[0];
        int age = Integer.parseInt(nameAge[1]);
        if (age <= 1) {
            System.out.println("Age not enter");
        }

        System.out.print("Weight (input format: 1 = kg 2 = pound value): ");
        int type = input.nextInt();
        double weight = input.nextDouble();
        if (type == 1) {
            weight /= 0.45359237;
        }
        System.out.print("Height (input format: 1 = meter 2 = feet-inch): ");
        type = input.nextInt();
        double height;
        if (type == 1) {
            height = input.nextDouble() / 0.0254;
        } else {
            height = input.nextDouble() * 12 + input.nextDouble();
        }

        BMI bmi = new BMI(name, age, weight, 0, height);
        bmi.display_BMI();

    }
}