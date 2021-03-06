import java.util.Date;

public abstract class GeometricOject {
  private String color;
  private boolean filled;
  private Date dateCreated;  

  protected GeometricOject() {
    dateCreated = new Date();
  }

  protected GeometricOject(String color, boolean filled){
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
