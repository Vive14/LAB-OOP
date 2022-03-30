import java.util.Date;

public class Employee extends Person{
    
    protected String Office;
	protected int salary;
	protected Date DateHired;

    public Employee(String name, String address, String PhoneNumber, String EmailAdrees, String Office, int salary, Date DateHired){
        super(name, address, PhoneNumber, EmailAdrees);
        this.Office = Office;
		this.salary = salary;
		this.DateHired = DateHired;
    }

    public String getOffice() {

		return Office;
	}

	public void setOffice(String Office) {

		this.Office = Office;
	}

	public int getSalary() {

		return salary;
	}

	public void setSalary(int salary) {

		this.salary = salary;
	}

	public Date getDateHired() {

		return DateHired;
	}

	public void setDateHired(Date DateHired) {

		this.DateHired = DateHired;
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
	}

	@Override
	public String toString() {

		return super.toString() + " Employee{" +
			"office=" + this.Office + ", " +
			"salary=" + this.salary + ", " +
			"date_hired=" + this.DateHired + "}";
	}


}
