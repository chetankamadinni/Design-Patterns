package Adapter;

public class EmployeeLDAPAdapter implements Employee  {

	private EmployeeLDAP employeeLDAP;
	
	public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
		this.employeeLDAP = employeeLDAP;
	}
	
	@Override
	public String getId() {
		return employeeLDAP.getCn() + "";
	}

	@Override
	public String getFirstName() {
		return employeeLDAP.getGivenName();
	}

	@Override
	public String getLastName() {
		return employeeLDAP.getFamilyName();
	}

	@Override
	public String getEmailId() {
		return employeeLDAP.getEmail();
	}

}
