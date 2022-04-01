import java.util.Date;

public abstract class GeometricOject1 {
  private String color;
  private boolean filled;
  private Date dateCreated;  

  protected GeometricOject1() { 
    dateCreated = new Date();     
  }

  protected GeometricOject1(String color, boolean filled){
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

  public boolean isFilled(boolean filled){
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
      return "\nCreatrd on " + dateCreated + "\ncolor : " + color + "and filled : " + filled;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

}
