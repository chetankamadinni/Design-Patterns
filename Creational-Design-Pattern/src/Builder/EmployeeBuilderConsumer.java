package Builder;

public class EmployeeBuilderConsumer {
	public static void main(String[] args) {
		Employee.Builder builder = new Employee.Builder();
		builder.name("John Smith").dept("R&D").salary(100000.00);
		Employee employee = builder.build();
		System.out.println(employee);
	}
}
