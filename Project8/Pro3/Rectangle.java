public class Rectangle extends GeometricOject implements Comparable{
    double width = 1;
    double height = 1;

    public Rectangle(){}

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void Comparable() {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2 )+ (this.height * 2);
    }



}

