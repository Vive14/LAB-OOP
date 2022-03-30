import java.util.*;
public class Lab4_Pro2_64010451 {
    public static void main(String[] args) {
        GregorianCalendar oops = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + oops.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + oops.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + oops.get(GregorianCalendar.DATE));
        System.out.println("Day of the week is " + oops.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("--------------");
        oops.setTimeInMillis(oops.getTimeInMillis()+(24*60*60*1000));
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + oops.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + oops.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + oops.get(GregorianCalendar.DATE));
        System.out.println("Day of the week is " + oops.get(GregorianCalendar.DAY_OF_WEEK));  
        System.out.println(oops.getTime());   
    }
}
