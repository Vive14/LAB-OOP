import java.util.Scanner;

public class Lab2_Pro1_64010451 {
    public static void main(String[] args) {
        int day, elapsed, future_day;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter to day's: ");
            day = input.nextInt();
        } while (day < 0 || day > 6);

        do {
            System.out.print("Enter the number of days elapsed since today: ");
            elapsed = input.nextInt();
        } while (elapsed < 0);

        future_day = (day + elapsed) % 7;
        String future_day_str, to_day_str;

        if (day == 0) {
            to_day_str = "Sunday";
        } else if (day == 1) {
            to_day_str = "Monday";
        } else if (day == 2) {
            to_day_str = "Tuesday";
        } else if (day == 3) {
            to_day_str = "Wednesday";
        } else if (day == 4) {
            to_day_str = "Thursday";
        } else if (day == 5) {
            to_day_str = "Friday";
        } else {
            to_day_str = "Saturday";
        }

        if (future_day == 0) {
            future_day_str = "Sunday";
        } else if (future_day == 1) {
            future_day_str = "Monday";
        } else if (future_day == 2) {
            future_day_str = "Tuesday";
        } else if (future_day == 3) {
            future_day_str = "Wednesday";
        } else if (future_day == 4) {
            future_day_str = "Thursday";
        } else if (future_day == 5) {
            future_day_str = "Friday";
        } else {
            future_day_str = "Saturday";
        }

        System.out.println("Today is " + to_day_str + " and the future day is " + future_day_str);

        input.close();

    }
}
