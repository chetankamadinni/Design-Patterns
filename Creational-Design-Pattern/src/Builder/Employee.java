package Builder;

public class Employee {
	private String name;
	private String dept;
	private double salary;

	public static class Builder {
		private String name;
		private String dept;
		private double salary;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder dept(String dept) {
			this.dept = dept;
			return this;
		}

		public Builder salary(Double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	private Employee(Builder builder) {
		this.name = builder.name;
		this.dept = builder.dept;
		this.salary = builder.salary;
	}

	@Override
	public String toString() {
		return "Employee[Name:"+this.name + ", Dept:"+this.dept+", Salary:"+this.salary+"]";
	}
}
