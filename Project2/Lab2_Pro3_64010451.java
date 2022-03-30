import java.util.Scanner;

public class Lab2_Pro3_64010451 {
    public static void main(String[] args) {

        String first_city, second_city, third_city;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        first_city = input.nextLine();
        System.out.print("Enter the second city: ");
        second_city = input.nextLine();
        System.out.print("Enter the third city: ");
        third_city = input.nextLine();

        String deposit_str = "";
        // อันที่เรียงถูก(-1) เเสดงได้เลย อันไหนที่เหมือนกัน(0) เเสดงได้เลย
        // อันไหนทีผิด(1) จะทำการเรียงใหม่โดยใช่วิธีการฝากของ

        if (first_city.compareTo(second_city) < 0 && first_city.compareTo(third_city) < 0) 
        {
            if (second_city.compareTo(third_city) < 0) {
                deposit_str = first_city + " " + second_city + " " + third_city;
            } else {
                deposit_str = first_city + " " + third_city + " " + second_city;
            }
        }
        else if (second_city.compareTo(first_city) < 0 && second_city.compareTo(third_city) < 0 ) 
        {
            if (first_city.compareTo(third_city) < 0) {
                deposit_str = second_city + " " + first_city + " " + third_city;
            } else {
                deposit_str = second_city + " " + third_city + " " + first_city;
            }
        }
        else if (third_city.compareTo(first_city) < 0 && third_city.compareTo(second_city) < 0) 
        {
            if (first_city.compareTo(second_city) < 0) 
            {
              deposit_str = third_city + " " + first_city + " " +second_city; 
            } else {
                deposit_str = third_city + " " + second_city + " " + first_city;
            }
        }
        
        System.out.println("The three citirs in alphabetical order are " +deposit_str);
       
        input.close();

    }
}
