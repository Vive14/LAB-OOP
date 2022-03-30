public class gas_pump {
    private String name_gas_pump;
    private String name_oil;
    private double remaining_oil;
    private double baht_per_gallon;
    private double balance;

    public gas_pump(String name_gas_pump, String name_oil, double remaining_oil, double baht_per_gallon, double balance){
        this.name_gas_pump = name_gas_pump;
        this.name_oil = name_oil;
        this.remaining_oil = remaining_oil;
        this.baht_per_gallon = baht_per_gallon;
        this.balance = balance;
        pump_count++;
    }

    public gas_pump(String name_gas_pump, String name_oil, double remaining_oil, double baht_per_gallon){
        this.name_gas_pump = name_gas_pump;
        this.name_oil = name_oil;
        this.remaining_oil = remaining_oil;
        this.baht_per_gallon = baht_per_gallon;
        this.balance = 0;
        pump_count++;
    }

    public void set_name_gas_pump(String name_gas_pump){
        this.name_gas_pump = name_gas_pump;
    }

    public void set_name_oil(String name_oil){
        this.name_oil = name_oil;
    }

    public void set_remaining_oil(double remaining_oil){  //น้ำมันคงเหลือ
        this.remaining_oil = remaining_oil;
    }

    public void set_baht_per_gallon(double baht_per_gallon){  //บาท ต่อ เเกลรอน
        this.baht_per_gallon = baht_per_gallon;
    }

    public void set_name_oil(double balance){  //เงินคงที่มีทั้งหมด
        this.balance = balance;
    }

    public String get_name_gas_pump(){
        return this.name_gas_pump;
    }

    public String get_name_oil(){
        return this.name_oil;
    }

    public double get_remaining_oil(){
        return this.remaining_oil;
    }

    public double get_baht_per_gallon(){
        return this.baht_per_gallon;
    }

    public double get_balance(){
        return this.balance;
    }

    public void buy_oil(int gallon){
        double price = baht_per_gallon * gallon; 
        this.balance += price;
        this.remaining_oil -= gallon;
    }

    public static int pump_count;

    public static int get_pump_count(){
        return pump_count;
    }

    public void display(){
        System.out.println("Name pump :" + name_gas_pump);
        System.out.println("Name oil" + name_oil);
        System.out.println("Remaining_oil" + remaining_oil);
        System.out.println("Baht_per_gallon" + baht_per_gallon);
        System.out.println("Balance" + balance);
        
    }
        
    






    












    

    
}
