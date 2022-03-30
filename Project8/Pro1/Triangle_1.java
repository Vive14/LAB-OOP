public class Triangle_1 extends GeometricOject_1{
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle_1(double sideA, double sideB, double sidec) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sidec;
    }

    public Triangle_1(double sideA, double sideB, double sideC, String color, boolean filled) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB(){
        return this.sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideC(){
        return this.sideC;
    }

    @Override
    public double getArea(){
        double area = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt((area*(area-sideA)) * (area-sideB) * (area-sideC));
    }

    @Override
    public double getPerimeter(){
        return sideA+ sideB + sideC;
    }

    @Override
    public String toString() {
        return super.toString() + "\narea : " + getArea() + "\nperimeter : " + getPerimeter();
    }

    
}
