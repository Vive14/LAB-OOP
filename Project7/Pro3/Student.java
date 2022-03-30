public class Student extends Person{

    protected String status;
    public static final String FRESHMAN = "FRESHMAN";
	public static final String SOPHOMORE = "SOPHOMORE";
	public static final String JUNIOR = "JUNIOR";
	public static final String SENIOR = "SENIOR";

    public Student(String name, String address, String PhoneNumber, String EmailAdrees, String status){
        super(name, address, PhoneNumber, EmailAdrees);
        this.status = status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
    public String getStatus() {

		return this.status;
	}


    @Override
	public String toString() {
		return super.toString() + " Student{" + "status=" + this.status + "}";
	}
 
    
}
