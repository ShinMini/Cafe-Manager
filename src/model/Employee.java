package model;

public class Employee {
	private String employeeName;
	private int employeeAge;
	private String employeeEmail;


	public Employee(String employeeName, int employeeAge, String employeeEmail) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeEmail = employeeEmail;

	}
	// toString
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeAge=" + employeeAge + ", employeeEmail="
				+ employeeEmail + "]";
	}

	// Getter & Setter
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return employeeAge;
	}
	public void setAge(int age) {
		this.employeeAge = age;
	}
	public String getEmail() {
		return employeeEmail;
	}
	public void setEmail(String email) {
		this.employeeEmail = email;
	}
}
