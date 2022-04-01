
public class Triangle extends GeometricOject1{
    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;

    public Triangle(){
        super();           
    }; 

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSideA(double side1) {
        this.side1 = side1;
    }

    public double getSideA() {
        return side1;
    }

    public void setSideB(double side2) {
        this.side2 = side2;
    }

    public double getSideB(){
        return this.side2;
    }

    public void setSideC(double side3) {
        this.side3 = side3;
    }

    public double getSideC(){
        return this.side3;
    }

    @Override
    public double getArea() {
        double area = (this.side1+ this.side2 + this.side3) / 2;
        return Math.sqrt((area*(area-side1)) * (area-side2) * (area-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+ side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public void display() {
		System.out.println("\nTriangle:");
		System.out.println("-Area: " + this.getArea());
		System.out.println("-Perimeter: " + this.getPerimeter());
		System.out.println("-Color: " + this.getColor());
		System.out.println("-Filled: " + this.getFilled());
	}

    
}
