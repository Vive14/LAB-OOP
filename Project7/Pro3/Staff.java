import java.util.Date;

public class Staff extends Employee{
    protected String title;

    public Staff(String name, String address, String PhoneNumber, String EmailAdrees, String Office, int salary, Date DateHired, String title){
        super(name, address, PhoneNumber, EmailAdrees, Office, salary, DateHired);
        this.title = title;
    }

    public void setTitle(String title) {

		this.title = title;
	}

	public String getTitle() {

		return title;
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
		System.out.println("Title: " + this.title);
	}

	@Override
	public String toString() {

		return super.toString() + " Staff{" + "title=" + this.title + "}";
	}


}
