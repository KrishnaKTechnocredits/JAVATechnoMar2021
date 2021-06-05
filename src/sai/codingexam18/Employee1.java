package sai.codingexam18;

public class Employee1 {

	private int empID;
	private String empName;
	private String empAddress;

	Employee1(int empID, String empName, String empAddress) {
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public String toString() {
		return empID + "-" + empName + "-" + empAddress;
	}

	public int hashCode() {

		return this.empID;
	}

	public boolean equals(Object obj) {
		Employee1 emp = (Employee1) obj;
		if (this.empID == emp.empID && this.empName.equals(emp.empName))
			return true;
		return false;
	}
}