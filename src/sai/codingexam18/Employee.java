package sai.codingexam18;

public class Employee implements Comparable<Employee> {

	private int empID;
	private String empName;
	private String empAddress;

	Employee(int empID, String empName, String empAddress) {
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public String toString() {
		return empID + "-" + empName + "-" + empAddress;
	}

	public int compareTo(Employee emp) {
		return (this.empID - emp.empID);
	}
}