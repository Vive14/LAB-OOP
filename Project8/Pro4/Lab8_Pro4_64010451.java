public class Lab8_Pro4_64010451 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(1, "red", true);
        Octagon octagon2 = octagon1.clone();
        System.out.println(octagon1);
        octagon1.compareTo(octagon2);
        
        
    }
}
