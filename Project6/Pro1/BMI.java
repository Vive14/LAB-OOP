public class BMI {

    public String name;
    public int age;
    public double weight;
    public double feet;
    public double inches;

    public final double pound_per_kilo = 0.45359237;
    public final double inch_per_meter = 0.0254; // 1 feet = 12 inch

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double calculate_BMI() {
        double weight_Kilograms = this.weight * pound_per_kilo;
        double height_meters = this.inches * inch_per_meter;
        return weight_Kilograms / (height_meters * height_meters);
    }

    public String getInterpretation() {
        if (calculate_BMI() < 18.5) return "Underweight" ;
        if (calculate_BMI() < 25.0) return "Normal";
        if (calculate_BMI() < 30.0) return "Overweight";
        return "Obese";   
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getFeet() {
        return this.feet;
    }

    public double getInches(){
        return this.inches;
    }

    public void display_BMI(){
        System.out.printf("Your BMI : %.2f\n", calculate_BMI());
        System.out.println("Interpretation : " + getInterpretation());

    }



}
