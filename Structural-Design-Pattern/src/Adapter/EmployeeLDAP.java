package Adapter;

public class EmployeeLDAP{
	
	private int cn;
	private String givenName;
	private String familyName;
	private String email;
	
	public EmployeeLDAP(int cn, String givenName, String familyName, String email) {
		this.cn = cn;
		this.givenName = givenName;
		this.familyName = familyName;
		this.email = email;
	}

	public int getCn() {
		return cn;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getEmail() {
		return email;
	}

}
