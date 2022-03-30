
public class Lab8_Pro2_64010451 {
    public static void main(String[] args) {
        GeometricOject_1[] squares = {new Square(5,"green",true),new Square(6,"red",true),
        new Square(7,"blue",true),new Square(8,"yellow",true),new Square(9,"pink",true)};

        for (int i = 0; i < squares.length; i++) {
            System.out.println();
            System.out.println(squares[i]);
            ((Square)squares[i]).howToColor(); /// 
            System.out.println();
        }
    }
}