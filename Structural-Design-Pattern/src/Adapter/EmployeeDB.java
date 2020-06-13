package Adapter;

public class EmployeeDB implements Employee {
	
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public EmployeeDB(String id, String firstName, String lastName, String emailId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "ID: "+this.id + ", First Name: "+this.firstName+ ", Last Name: "+this.lastName+", Emial Id: "+this.emailId;
	}
}
