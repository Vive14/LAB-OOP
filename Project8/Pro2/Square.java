public class Square extends GeometricOject_1 implements Colorable{

    private double side;

    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() { 
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "\narea : " + getArea() + "\nperimeter : " + getPerimeter();
    }
    
}
