import java.sql.Time;
import java.util.Date;

public class Faculty extends Employee{
    protected Time OfficeHours;
	protected int rank;

    public Faculty(String name, String address, String PhoneNumber, String EmailAdrees, String Office, int salary, Date DateHired, Time OfficeHours, int rank){
        super(name, address, PhoneNumber, EmailAdrees, Office, salary, DateHired);
        this.OfficeHours = OfficeHours;
		this.rank = rank;
    }
    
    public void setOfficeHours(Time OfficeHours) {

        this.OfficeHours = OfficeHours;
    }
    
	public Time getOfficeHours() {

		return OfficeHours;
	}

    public void setRank(int rank) {

        this.rank = rank;
    }

	public int getRank() {

		return rank;
	}

    @Override
	public void display() {

	
		System.out.println("Employee");
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Phone: " + this.PhoneNumber);
		System.out.println("Email: " + this.EmailAdrees);
		System.out.println("Office: " + this.Office);
		System.out.println("Salary: " + this.salary);
		System.out.println("Date hired: " + this.DateHired);
        System.out.println("Office hour: " + this.OfficeHours);
		System.out.println("Rank: " + this.rank);
	}

	@Override
	public String toString() {
        
		return super.toString() + " Faculty{" + "office_hour=" + this.OfficeHours + ", " +"rank=" + this.rank + "}";

	}
}
