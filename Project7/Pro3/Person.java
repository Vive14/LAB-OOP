public class Person {

    protected String name;
	protected String address;
	protected String PhoneNumber;
	protected String EmailAdrees;

    public Person(String name, String address, String PhoneNumber, String EmailAdrees){
        this.name = name;
        this.address = address;
        this.PhoneNumber = PhoneNumber;
        this.EmailAdrees= EmailAdrees;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address) {

		this.address = address;
	}

    public String getAddress() {

		return address;
	}

    public void setPhoneNumber(String PhoneNumber) {

		this.PhoneNumber = PhoneNumber;
	}

    public String getPhoneNumber() {

		return PhoneNumber;
	}

    public void setEmailAddress(String EmailAdrees) {

		this.EmailAdrees = EmailAdrees;
	}

    public String getEmailAddress() {

		return EmailAdrees;
	}

    public void display() {

		System.out.println("Person");
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Phone: " + this.PhoneNumber);
		System.out.println("Email: " + this.EmailAdrees);
	}

    @Override
    public String toString(){
        return "Person{" + "name= " + this.name + "," + 
        "address=" + this.address + ", " + "email=" + this.EmailAdrees + "}";
    }








}
