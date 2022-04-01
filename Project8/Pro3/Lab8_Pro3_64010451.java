public class Lab8_Pro3_64010451 {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle(5, 10, "red", true);
        Rectangle shape2 = new Rectangle(5, 12, "blue", true);
        System.out.println(shape1);
        System.out.println("======================================================================");
        System.out.println(shape2);
        System.out.println("======================================================================");
        System.out.println(shape1.compareTo(shape2));
        System.out.println(shape1.equals(shape2));
    }
}
