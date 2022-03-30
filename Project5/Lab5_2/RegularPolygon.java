public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int n){
        this.n = n;
    }

    public double get_N(){
        return this.n;
    }
    
    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public void set_X(double x){
         this.x = x;
    }

    public double get_x(){
        return this.x;
    }

    public void set_y(double y){
        this.y = y;
   }

   public double get_y(){
       return this.y;
   }

   public double getPerimeter(){
       return this.n * this.side;
   }

   public double getArea(){
       return (this.n * this.side * this.side) / 4 * Math.tan(Math.PI / this.n);
   }

   public void displayRegular1(){
    System.out.println("The perimeter of Regular1: " + getPerimeter());
    System.out.println("The area of Regular1: " + getArea());
   }

   public void displayRegular2(){
    System.out.println("The perimeter of Regular2: " + getPerimeter());
    System.out.println("The area of Regular2: " + getArea());
   }

   public void displayRegular3(){
    System.out.println("The perimeter of Regular3: " + getPerimeter());
    System.out.println("The area of Regular3: " + getArea());
   }





}
