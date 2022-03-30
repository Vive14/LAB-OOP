import java.util.Date;

public abstract class GeometricOject_1 {
  private String color;
  private boolean filled;
  private Date dateCreated;  

  protected GeometricOject_1() {   //no-arg default (มี super() อยู่กรณีที่มีการสืบทอด) constructor 
    dateCreated = new Date();     
  }

  protected GeometricOject_1(String color, boolean filled){
      dateCreated = new Date();
      this.color = color;
      this.filled = filled;
  }

  public void setColor(String color){
      this.color = color;
  }

  public String getColor(){
      return this.color;
  }

  public boolean isFill(boolean filled){
      return this.filled;
  }

  public boolean getFilled(){
      return this.filled;
  }

  public void setFilled(boolean filled){
      this.filled = filled;
  }

  public Date getDateCreated(){
      return dateCreated;
  }

  public String toString(){
      return "Creatrd on " + dateCreated + "\ncolor : " + color + "and filled : " + filled;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

}
