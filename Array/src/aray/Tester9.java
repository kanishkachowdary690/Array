package aray;

public class Tester9 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmployeeId("c101");
		employee.setEmployeeName("Jack");
		employee.setSalary(45000);
		employee.setJobLevel(4);
		System.out.println(employee.calculateSalary());
	}

}
class Employee {
private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	public int calculateSalary() {
		if (jobLevel >= 4) {
			bonus = 100;
		} else {
			bonus = 50;
		}
		salary +=bonus;
		return salary;
	}
	}