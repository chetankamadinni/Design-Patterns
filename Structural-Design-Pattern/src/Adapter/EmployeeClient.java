package Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeDB = new EmployeeDB("1", "Chetan", "Kamadinni", "chetan@test.com");
		employees.add(employeeDB);

		EmployeeLDAP employeeLDAP = new EmployeeLDAP(2, "John", "Smith", "john.smith@test.com");
		employees.add(new EmployeeLDAPAdapter(employeeLDAP));
		return employees;
		
	}
}
